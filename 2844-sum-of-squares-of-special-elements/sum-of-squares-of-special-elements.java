class Solution {
    public int sumOfSquares(int[] nums) {
        int ans = 0;
        int l = nums.length;
        for(int i = 1 ;i <= l;i++){
            if(l%i == 0){
                ans += nums[i-1] * nums[i-1];
            }
        }
        return ans;
    }
}