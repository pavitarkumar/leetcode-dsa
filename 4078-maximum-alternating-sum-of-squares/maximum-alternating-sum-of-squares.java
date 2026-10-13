import java.util.Arrays;
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int l = nums.length;
        for(int i = 0; i < l;i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long score = 0;
        for(int i = 0;i < l;i++){
            long sq = (long) nums[i] * nums[i];
            if(i < l/2){
                score -= sq;
            }else{
                score += sq;
            }
        }
        return score;
    }
}