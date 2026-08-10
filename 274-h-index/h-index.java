class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int ans = 0;
        for(int i = 0;i <= 1000 ;i++){
            int check = 0;
            for(int j = 0 ;j < n;j++){
                if(citations[j] >= i){
                    check++;
                }
            }
            if(check >= i){
                ans = Math.max(ans,i);
            }
        }
        return ans;
    }
}