class Solution {
    public int count(int n){
        int ans = 0; 
        while(n > 0){
            int bitmask = 1;
            if((n & bitmask) != 0) ans++;
            n = n >> 1;
        }
        return ans;
    }
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i = 0 ;i <= n;i++){
            int c = count(i);
            arr[i] = c;
        }
        return arr;
    }
}