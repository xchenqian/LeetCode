import java.util.List;
import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class _101_symmetric_tree {

    public boolean isSymmetric(TreeNode root) {
        if (root==null) {
            return true;
        }
        return cmp(root.left, root.right);
    }

    private boolean cmp(TreeNode left, TreeNode right){
        if (left==null && right==null) {
            return true;
        }else if(left==null && right!=null || left!=null && right==null 
            || left.val != right.val 
            || !cmp(left.right, right.left) || !cmp(left.left, right.right)){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        _101_symmetric_tree a = new _101_symmetric_tree();

        TreeNode head = new TreeNode(1);
        TreeNode cur = head;
        
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        
        cur.left = node2;
        cur.right = node3;
        cur.left.left = node4;
        cur.right.right = node5;

        System.out.println("res:"+a.isSymmetric(head));        
    }
    
}