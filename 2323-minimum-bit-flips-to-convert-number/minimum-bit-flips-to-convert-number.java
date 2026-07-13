class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int ans = 0;
        while(xor > 0){
            int mask = 1;
            if((xor & mask) == 1) ans++;
            xor>>=1;
        }
        return ans;
    }
}