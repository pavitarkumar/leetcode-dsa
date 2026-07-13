class Solution {
    public int bitwiseComplement(int n) {
        if(n== 0) return 1;
        int c = 0;
        int num = n;
        while(n > 0){
            c++;
            n >>= 1;
        }
        int mask = 0;
        while(c > 0){
            mask <<= 1;
            mask |= 1;
            c--;
        }
        return num ^ mask;
    }
}