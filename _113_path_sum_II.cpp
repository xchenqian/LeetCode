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
    vector<vector<int>> pathSum(TreeNode* root, int sum) {
        vector<vector<int>> paths;
        vector<int> path;
        helper(root, sum, paths, path);
        return paths;
    }

private:
    void helper(TreeNode* root, int sum, vector<vector<int>> &paths, vector<int> &path){
        if(!root){
            return;
        }
        path.push_back(root->val);
        if(!root->left && !root->right && root->val == sum){
            paths.push_back(path);
        }
        if(root->left){
            helper(root->left, sum - root->val, paths, path);
        }
        if(root->right){
            helper(root->right, sum - root->val, paths, path);
        }  
        path.pop_back();
    }
    
};