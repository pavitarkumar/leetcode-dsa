class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;
        int p [] = new int[n];
        p[0] = stones[0];
        for(int i = 1;i < n;i++){
            p[i] = p[i-1] + stones[i];
        }
        int f[] = new int[n];
        f[n-1] = p[n-1];
        for(int i = n-2;i >= 1 ;i--){
            f[i] = Math.max(f[i+1],p[i] - f[i+1]);
        }
        return f[1];
    }
}