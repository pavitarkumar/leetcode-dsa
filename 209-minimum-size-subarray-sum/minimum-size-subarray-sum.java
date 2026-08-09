class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int end = 1;
        int summ = nums[0];
        int st = 0;
        int ans = Integer.MAX_VALUE;
        while(end <= nums.length){
            if(summ >= target){
                ans = Math.min(ans,end -st);
            }
            if(end == nums.length) break;
            summ += nums[end];
            end++;
            while(summ - nums[st] >= target){
                summ -= nums[st];
                st++;
                ans = Math.min(ans,end -st);
            }
        }
        return (ans == Integer.MAX_VALUE) ? 0 : ans;

    }
}