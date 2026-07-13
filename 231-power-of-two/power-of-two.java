class Solution {
    public boolean isPowerOfTwo(int n) {
        int ans = 0;
        while(n > 0){
            int bitmask = 1;
            if((n&bitmask) != 0) ans++;
            n >>= 1;
        }
        if(ans == 1) return true;
        return false;
    }
}