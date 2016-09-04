import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Collections;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class _107_binary_tree_level_order_traversal_II {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<Integer>();            
            for (int i=0; i<size; i++) {                
                TreeNode node = queue.poll();                
                level.add(node.val);
                if (node.left!=null) {
                    queue.offer(node.left);
                }
                if (node.right!=null) {
                    queue.offer(node.right);
                }
            }
            list.add(level);
        }
        Collections.reverse(list);
        return list;
    }
    
    public static void main(String[] args) {
        _107_binary_tree_level_order_traversal_II a = new _107_binary_tree_level_order_traversal_II();

        TreeNode head = new TreeNode(3);
        TreeNode cur = head;
        TreeNode node2 = new TreeNode(9);
        cur.left = node2;
        
        TreeNode node3 = new TreeNode(20);
        cur.right = node3;

        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node3.left = node4;
        node3.right = node5;

        List<List<Integer>> res = a.levelOrderBottom(head);             
        for (int i=0; i<res.size(); i++) {
            for (int j=0; j<res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    
}