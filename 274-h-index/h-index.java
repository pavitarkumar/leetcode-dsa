class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        int papers;
        for(int i = 0;i < n;i++){
            papers = n - i;
            if(citations[i] >= papers){
                return papers;
            }
        }
        return 0;
    }
}