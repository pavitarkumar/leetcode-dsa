class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0;i < n - 3;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i + 1;j < n - 2; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                long t = (long)target - nums[i] - nums[j];
                int l = n- 1;
                int f = j+1;
                while(f < l){
                    long s = (long)nums[f] + nums[l];
                 if(t == nums[f] + nums[l]){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[f],nums[l]));
                    f++;
                    l--;
                    while(f < l && nums[f] == nums[f-1]) f++;
                    while(f < l && nums[l] == nums[l+1]) l--;
                }else if(t > nums[f] + nums[l]){
                    f++;
                }else if(t < nums[f] + nums[l]){
                    l--;
                }
            }
        }
    }
    return ans;
    }
}