class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        for(int i = n-2;i >= 0;i--){
            if(nums[i] < nums[i+1]) {
              idx = i;
              break;
            }
        }
        if(idx == -1){
            for(int i = 0;i < n/2;i++){
                int temp = nums[i];
                nums[i] = nums[n-i-1];
                nums[n-i-1] = temp;
            }
            return ;
        }
        for(int i = idx+1,j = n-1;i < j;i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
        int idx2 = idx+1;
        for(int i = idx+1;i < n;i++){
            if(nums[i] > nums[idx]){
                idx2 = i;
                break;
            }
        }
        int temp = nums[idx];
        nums[idx] = nums[idx2];
        nums[idx2] = temp;
        return ;
    }
}