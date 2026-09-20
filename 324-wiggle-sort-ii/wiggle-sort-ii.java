import java.util.Arrays;
class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int arr[] = nums.clone();
        Arrays.sort(arr);
        int median = arr[n/2];
        int left = 0;
        int i = 0;
        int right = n-1;
        while(i <= right){
            int idx = (i*2+1)%(n|1);
            if(nums[idx] > median){
                int leftidx = (left*2+1)%(n|1);
                swap(nums,leftidx,idx);
                i++;
                left++;
            }else if(nums[idx] < median){
                int rightidx = (right*2+1)%(n|1);
                swap(nums,rightidx,idx);
                right--;
            }else{
                i++;
            }
        }


    }
    public void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}