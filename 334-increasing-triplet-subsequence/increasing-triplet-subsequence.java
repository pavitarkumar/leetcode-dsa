class Solution {
    public boolean increasingTriplet(int[] nums) {
        int firstMin = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i : nums){
            if(i <= firstMin){
                firstMin =i;
            }else if(i <= secMin){
                secMin = i;
            }else{
                return true;
            }
        }
        return false;

    }
}