/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        return helper(0, 0, inorder.size()-1, preorder, inorder);
    }

private:
    TreeNode* helper(int prestart, int instart, int inend, vector<int>& preorder, vector<int>& inorder) {
        if(prestart > preorder.size() - 1 || instart > inend){
            return nullptr;
        }
        TreeNode *root = new TreeNode(preorder[prestart]);
        int rootIndex;
        for(int i=instart; i<=inend; i++){
            if(inorder[i] == preorder[prestart]){
                rootIndex = i;
                break;
            }   
        }
        root->left = helper(prestart + 1, instart, rootIndex - 1, preorder, inorder);
        root->right = helper(prestart + rootIndex - instart + 1, rootIndex + 1, inend, preorder, inorder);
        return root;
    }
};