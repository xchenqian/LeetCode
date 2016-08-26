import java.util.List;
import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class _257_binary_tree_paths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if (root==null) {
            return result;
        }        
        getPaths(root, String.valueOf(root.val), result);

        return result;
    }

    private void getPaths(TreeNode node, String path, List<String> res){
        if (node==null) {
            return;
        }
        if (node.left==null && node.right==null) {
            res.add(path);
            return;
        }
        if (node.left!=null) {
            getPaths(node.left, path+"->"+String.valueOf(node.left.val), res);            
        }
        if (node.right!=null) {
            getPaths(node.right, path+"->"+String.valueOf(node.right.val), res);            
        }
    }

    public static void main(String[] args) {
        _257_binary_tree_paths a = new _257_binary_tree_paths();

        TreeNode head = new TreeNode(1);
        TreeNode cur = head;
        TreeNode tmp = new TreeNode(3);
        cur.right = tmp;
        
        tmp = new TreeNode(2);
        cur.left = tmp;
        cur = tmp;

        tmp = new TreeNode(5);
        cur.right = tmp;
        cur = tmp;

        List<String> res = new ArrayList<String>();
        res = a.binaryTreePaths(head);

        System.out.println(res.size());
        for (int i=0; i<res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
    
}