class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int zero = 0;
        for(int i = 0;i < n;i++){
            ans ^= nums[i];
            if(nums[i] == 0) zero++;
        }
        if(ans != 0) return n;
        else{
            if(zero == n) return 0;
        }
        return n - 1;
    }
}