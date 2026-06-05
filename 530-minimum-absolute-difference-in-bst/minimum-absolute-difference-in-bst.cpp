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
    void helper(TreeNode* root,int& prev,int& mindif){
        if(root == NULL) return;
        helper(root->left,prev,mindif);
        if(prev != -1)  mindif = min(mindif,root->val - prev);
        prev = root->val;
        helper(root->right,prev,mindif);
    };
    int getMinimumDifference(TreeNode* root) {
        int prev = -1;
        int mindif = INT_MAX;
        helper(root,prev,mindif);
        return mindif;
    }
};