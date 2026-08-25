
class Solution {
public:
    int missingMultiple(vector<int>& nums, int k) {
        int n = nums.size();
        set<int> un;
        for(int i = 0;i < n;i++){
            un.insert(nums[i]);
        }
        n = 1;
        while(true){
            if(!un.contains(n*k)) return n*k;
            n++;
        }
        return 0;
    }
};