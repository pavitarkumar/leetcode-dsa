class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> s = new HashMap<>();
        int sum = 0;
        int ans = 0;
        s.put(0,1);
        for(int i = 0;i < n;i++){
            sum += nums[i];
            int remainder = sum % k;
            if(remainder < 0) remainder += k;
            ans += s.getOrDefault(remainder,0);
            s.put(remainder,s.getOrDefault(remainder,0)+1);
        }
        return ans;
    }
}