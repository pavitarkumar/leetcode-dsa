/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
        TreeNode* prev = nullptr;
        TreeNode* first = nullptr;
        TreeNode* sec = nullptr;
    void helper(TreeNode* root){
        if(root == NULL) return;
        helper(root->left);
        if(prev != NULL && prev->val > root->val){
            if(first == NULL) first = prev;
            sec = root;
        }
        prev = root;
        helper(root->right);
    }
    void recoverTree(TreeNode* root) {
        helper(root);
        swap(first->val,sec->val);
        return;
    }
};