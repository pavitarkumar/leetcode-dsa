class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
       int prefix[] = new int[arr.length + 1];
       for(int i = 0;i < arr.length;i++){
        prefix[i + 1] = arr[i] ^ prefix[i];
       }
       int ans[] = new int[queries.length];
       for(int i = 0;i < queries.length; i++){
        int l = queries[i][0];
        int r = queries[i][1];
        ans[i] = prefix[l] ^ prefix[r + 1];
       }
       return ans;
    }
}