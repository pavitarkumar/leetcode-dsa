class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += nums[i];
            int remainder = sum%k;
            if(remainder < 0) remainder += k;
        if(map.containsKey(remainder)){
            int index = map.get(remainder);
            if(i - index >= 2) return true;
        }else{
            map.put(remainder,i);
        }
        }
        return false;
    }
}