class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[0] == target) return 0;
        int n = nums.length;
        if(nums[n-1] < target) return n;
        for(int i = 0 ;i < n-1;i++){
            if(nums[i] < target && nums[i+1] >= target) return i+1;
            else if(nums[i] == target) return i;
        }
        return 0;
    }
}