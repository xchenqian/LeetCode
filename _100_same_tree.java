class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class _100_same_tree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null&&q!=null || p!=null&&q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        _100_same_tree a = new _100_same_tree();

        TreeNode head = new TreeNode(1);
        TreeNode cur = head;
        
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        
        cur.left = node2;
        cur.right = node3;

        TreeNode head2 = new TreeNode(1);
        TreeNode cur2 = head2;

        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(3);
    
        cur2.left = node4;
        cur2.right = node5;

        System.out.println("res:"+a.isSameTree(head, head2));        
    }
    
}