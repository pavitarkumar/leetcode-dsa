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
    vector<TreeNode*> vn;
    void inorder(TreeNode* root){
        if(root == NULL) return;
        inorder(root->left);
        vn.push_back(root);
        inorder(root->right);
    }
    void recoverTree(TreeNode* root) {
        inorder(root);
        TreeNode* first = NULL;
        TreeNode* sec = NULL;
        for(int i = 0;i < vn.size()-1;i++){
            if(vn[i]->val > vn[i+1]->val){
                if(first == NULL){
                    first = vn[i];
                }
                sec = vn[i+1];
            } 
        }
        swap(first->val,sec->val);
    }
};