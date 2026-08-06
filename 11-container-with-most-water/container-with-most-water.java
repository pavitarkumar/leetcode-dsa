class Solution {
    public int maxArea(int[] height) {
        int l = height.length - 1;
        int i = 0;
        int j = height.length - 1;
        int lmax = Integer.MIN_VALUE;
        int rmax = Integer.MIN_VALUE;
        int ans = 0;
        while(i < j){
            if(height[i] > lmax){
                lmax = height[i];
                if(i != 0) l--;
            }
            if(height[j] > rmax){
                rmax = height[j];
                if(j != height.length -1) l--;
            }
            ans = Math.max(ans,(j-i) * (Math.min(lmax,rmax)));
            if(height[i] > height[j]) j--;
            else i++;
        }
        return ans;
    }
}