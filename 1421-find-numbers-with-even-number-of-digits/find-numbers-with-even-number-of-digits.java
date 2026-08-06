class Solution {
    int checkNum(int num){
        int n = 0;
        while(num > 0){
            num /=10;
            n++;
        }
        return n;
    }
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i = 0;i < nums.length ; i++){
            if(checkNum(nums[i]) % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
}