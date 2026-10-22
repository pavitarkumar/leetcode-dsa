class Solution {
    public int findPairs(int[] nums, int k) {
        int l = nums.length;
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        for(int a : set){
            if(set.contains(a+k) && k > 0){
                ans+=1;
            }
        }
        if(k == 0){
            Map<Integer,Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            for (int count : map.values()) {
                if (count > 1) {
                    ans++;
                }
            }
        }
        return k < 0 ? 0 : ans;
    }
}