class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int ans = 0;
        int c = 0;
        for(int i = 0;i < n;i++){
            c += gain[i];
            ans = Math.max(c,ans);
        }
        return ans;
    }
}