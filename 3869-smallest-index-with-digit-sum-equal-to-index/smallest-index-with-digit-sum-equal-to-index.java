class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i< nums.length;i++){
            if(((nums[i] < 9) ? nums[i] : sumOfDigits(nums[i])) == i){
                return i;
            } 
        }
        return -1;
    }
    public int sumOfDigits(int i){
        int a = 0;
        while(i > 0){
            int b = i%10;
            a += b;
            i/=10;
        }
        return a;
    }
}