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
    bool isValidBST(TreeNode* root) {
        return helper(root, LONG_MIN, LONG_MAX);
    }

private:
    bool helper(TreeNode* root, long min, long max){
        if(!root){
            return true;
        }
        if(root->val >= max || root->val <= min){
            return false;
        }
        return helper(root->left, min, root->val) && helper(root->right, root->val, max);
    }
};