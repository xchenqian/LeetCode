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
    vector<int> rightSideView(TreeNode* root) {
        vector<int> res;
        rightSide(root, res, 0);
        return res;
    }

private:
    void rightSide(TreeNode* root, vector<int>& res, int curCount){
        if(!root) return;
        if(curCount == res.size()){
            res.push_back(root->val);
        }
        rightSide(root->right, res, curCount+1);
        rightSide(root->left, res, curCount+1);
    }
};