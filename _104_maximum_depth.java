class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class _104_maximum_depth {

    public int maxDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }else if (root.left==null && root.right==null) {
            return 1;
        }else{
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return 1+(left>right?left:right);
        }
    }

    public static void main(String[] args) {
        _104_maximum_depth a = new _104_maximum_depth();

        TreeNode head = new TreeNode(1);
        TreeNode cur = head;
        TreeNode tmp = new TreeNode(2);
        cur.left = tmp;
        
        tmp = new TreeNode(3);
        cur.right = tmp;
        cur = tmp;

        tmp = new TreeNode(4);
        cur.right = tmp;
        cur = tmp;

        tmp = new TreeNode(5);
        cur.left = tmp;
        cur = tmp;                
        
        System.out.println("re:"+a.maxDepth(head));

    }
    
}