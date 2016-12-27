/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class BSTIterator {
public:
    BSTIterator(TreeNode *root) {
        stack<TreeNode*> stc;
        while(root || !stc.empty()){
            while(root){
                stc.push(root);
                root = root->left;
            }
            root = stc.top();
            stc.pop();
            que.push(root);
            root = root->right;
        }
    }

    /** @return whether we have a next smallest number */
    bool hasNext() {
        return !que.empty();
    }

    /** @return the next smallest number */
    int next() {
        int res = que.front()->val;
        que.pop();
        return res;
    }

private:
    queue<TreeNode*> que;
};

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = BSTIterator(root);
 * while (i.hasNext()) cout << i.next();
 */