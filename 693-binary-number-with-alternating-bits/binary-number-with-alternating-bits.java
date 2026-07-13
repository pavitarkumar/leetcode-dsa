class Solution {
    public boolean hasAlternatingBits(int n) {
        int n1 = n ^ (n >> 1);
        return ((n1 & n1+1) == 0);
    }
}