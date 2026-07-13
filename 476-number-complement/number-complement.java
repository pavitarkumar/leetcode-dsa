class Solution {
    public int findComplement(int num) {
        int n = num;
        int ans = 0;
        while(n > 0){
            int bitmask = 1;
            ans++;
            n>>=1;
        }
        int mask = 0;
        while(ans > 0){
            ans--;
            mask <<= 1;
            mask |= 1;
        }
        return (~num) & mask;
    }
}