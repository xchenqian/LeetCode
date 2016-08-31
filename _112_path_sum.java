import java.util.List;
import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class _112_path_sum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null) {
            return false;
        }
        if (root.left==null && root.right==null) {
            return sum==root.val;
        }
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }

    public static void main(String[] args) {
        _112_path_sum a = new _112_path_sum();

        TreeNode head = new TreeNode(1);
        TreeNode cur = head;
        
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(6);
        
        cur.left = node2;
        cur.right = node3;
        cur.left.left = node4;
        cur.left.right = node5;
        cur.right.left = node6;

        System.out.println("res:"+a.hasPathSum(head,9));        
    }
    
}