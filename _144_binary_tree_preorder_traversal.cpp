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
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> res;
        stack<TreeNode*> stc;
        while(root || !stc.empty()){
            while(root){
                res.push_back(root->val);
                stc.push(root);
                root = root->left;
            }
            root = stc.top();
            stc.pop();
            root = root->right;
        }
        return res;
    }
};