class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> un = new HashSet<>();
        for(int i =0 ;i < n;i++){
            un.add(nums[i]);
        }
        n = k;
        while(un.contains(n)){
            n+=k;
        }
        return n;
    }
}