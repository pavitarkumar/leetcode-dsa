class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int n1 = 0;
        int n2 = 0;
        for(int i = 2;i < n;i++){
            if(arr1[n1] > arr2[n2]){
                arr1[++n1] = nums[i];
            }else{
                arr2[++n2] = nums[i];
            }
        }
        for(int i = 0;i <= n2;i++){
            arr1[++n1] = arr2[i];
        }
        return arr1;
    }
}