class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int zero = 0;
        for(int i : nums){
            xor ^= i;
            if(i == 0){
               zero++;
            } 
        }
        if(xor != 0) return nums.length;
        else{
            if(zero == nums.length) return 0;
        }
        return nums.length - 1;
    }
}