class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class _111_minimum_depth_of_binary_tree {

    public int minDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }
        return getMin(root);
    }

    private int getMin(TreeNode node){
        if (node==null) {
            return Integer.MAX_VALUE;
        }
        if (node.left==null && node.right ==null) {
            return 1;
        }
        return 1+ Math.min(getMin(node.left), getMin(node.right));
    }

    public static void main(String[] args) {
        _111_minimum_depth_of_binary_tree a = new _111_minimum_depth_of_binary_tree();

        TreeNode head = new TreeNode(1);
        TreeNode cur = head;
        
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(6);
        
        cur.left = node2;
        //cur.right = node3;
        //cur.left.left = node4;
        //cur.left.right = node5;
        //cur.right.left = node6;

        System.out.println("res:"+a.minDepth(head));        
    }
    
}