class Solution {
    public int binaryGap(int n) {
        int idx = -1;
        int count = 0;
        int maxcount = 0;
        while(n >0){
            if((n & 1) == 1){
                if(idx != -1){
                    maxcount = Math.max(count-idx,maxcount);
                }
                idx = count;
            }
            count++;
            n >>=1;
        }
        return maxcount;
    }
}