class Solution {
    public boolean search(int[] nums, int target) {
        int n  = nums.length;
        int pivot = 0;
        for(int i = 0;i < n-1;i++){
            if(nums[i] > nums[i+1]){
                pivot = i+1;
                break;
            }
        }
        if(bSearch(nums,0,pivot-1,target)) return true;
        if(bSearch(nums,pivot,n-1,target)) return true;
        return false;
    }
    public Boolean bSearch(int []arr,int low,int high ,int target){
            while(low <= high){
                int mid = low + (high - low)/2;
                if(arr[mid] == target) return true;
                else if(arr[mid] < target){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            return false;
        }
}