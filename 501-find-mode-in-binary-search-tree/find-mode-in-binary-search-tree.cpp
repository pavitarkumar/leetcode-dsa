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
    void helper(TreeNode* root,unordered_map<int,int>& un){
        if(root == NULL) return;
        un[root->val]++;
        helper(root->left,un);
        helper(root->right,un);
    }
    vector<int> findMode(TreeNode* root) {
        vector<int> ans;
        unordered_map<int,int> un;
        helper(root,un);
        int maxi = 0;
        for(auto &it : un){
            maxi = max(maxi,it.second);
        }
        for(auto &it : un){
            if(maxi == it.second){
                ans.push_back(it.first);
            }
        }
        return ans;
    }
};