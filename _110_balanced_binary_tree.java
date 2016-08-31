import java.util.List;
import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class _110_balanced_binary_tree {

    public boolean isBalanced(TreeNode root) {
        if (root==null) {
            return true;
        }
        return depth(root)!=-1;
    }

    private int depth(TreeNode node){
        if (node==null) {
            return 0;
        } 
        int left = depth(node.left);
        int right = depth(node.right);

        if (Math.abs(left-right)>1 || left==-1 || right==-1) {
            return -1;
        }

        return 1+Math.max(left,right);
    }

    public static void main(String[] args) {
        _110_balanced_binary_tree a = new _110_balanced_binary_tree();

        TreeNode head = new TreeNode(1);
        TreeNode cur = head;
        
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(6);
        
        cur.left = node2;
        //cur.right = node3;
        cur.left.left = node4;
        cur.left.right = node5;
        //cur.right.left = node6;

        System.out.println("res:"+a.isBalanced(head));        
    }
    
}