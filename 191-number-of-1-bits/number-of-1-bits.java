class Solution {
    public int hammingWeight(int n) {
        int ans = 0;
        while(n > 0){
            int bitmask = 1;
            if((n & bitmask) != 0) ans += 1;
            n=n>>1;
        }
        return ans;
    }
}