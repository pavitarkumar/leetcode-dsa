class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> ans = new ArrayList<>();
        int sl = s.length();
        int prefix[] = new int[sl+1];
        for(int i = 0;i < sl;i++){
            prefix[i+1] = prefix[i];
            int b = s.charAt(i) - 'a';
            prefix[i+1] ^= (1<<b);
        }
        int ro = queries.length;
        for(int i = 0;i < ro ;i++){
            // int check = 0;
            int l = queries[i][0];
            int r = queries[i][1];
            int k = queries[i][2];
            
            int mask = prefix[r+1] ^ prefix[l];
            int odd = Integer.bitCount(mask);
            odd /= 2;
            ans.add(odd <= k);
        }
        return ans;
    }
}