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
    int kthSmallest(TreeNode* root, int k) {
        int leftCounts = countNode(root->left);
        if(k <= leftCounts){
            return kthSmallest(root->left, k);
        }else if(k > leftCounts + 1){
            return kthSmallest(root->right, k - 1 - leftCounts);
        }
        return root->val;
    }
    
private:
    int countNode(TreeNode* root){
        if(root==nullptr){
            return 0;
        }
        return countNode(root->left) + countNode(root->right) + 1;
    }
};


/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution_2 {
public:
    int kthSmallest(TreeNode* root, int k) {
        if(root == nullptr){
            return 0;
        }
        stack<TreeNode*> stc;
        int count = 0, res = 0;
        while(root || !stc.empty()){
            while(root){
                stc.push(root);
                root = root->left;
            }
            count++;
            root= stc.top();
            if(count == k){
                res = root->val;
                break;
            }
            stc.pop();
            root = root->right;
        }
        return res;
    }
};