class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closestsum = nums[0] + nums[1] + nums[2];
        for(int i = 0;i < n - 2; i++){
            if(i != 0 && nums[i] == nums[i-1]) continue;
            // long a = nums[i];
            int s = i + 1;
            int e = n - 1;
            while(s < e){
                int summ = nums[i] + nums[s] + nums[e];
                if(Math.abs(target - summ) < Math.abs(closestsum - target)){
                    closestsum = summ;
                }
                if(summ < target) s++;
                else e--;
            }
        }
        return closestsum;
    }
}