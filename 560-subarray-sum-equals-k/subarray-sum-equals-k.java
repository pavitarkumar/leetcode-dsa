class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        int summ = 0;
        map.put(0,1);
        for(int i : nums){
            summ+=i;
            if(map.containsKey(summ - k)){
                ans += map.get(summ - k);
            }
            map.put(summ,map.getOrDefault(summ,0)+1);
        }
        return ans;
    }
}