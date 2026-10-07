class Solution {
    public int trap(int[] height) {
       int rightMax = 0;
       int leftMax = 0;
       int ans = 0;
       int l = 0;
       int r = height.length-1;
       while(l < r){
        if(height[l] <= height[r]){
            if(height[l] >= leftMax){
                leftMax = height[l];
            }else{
                ans += leftMax - height[l];
            }
            l++;
        }else{
            if(rightMax > height[r]){
                ans += rightMax - height[r];
            }else{
                rightMax = height[r];
            }
            r--;
        }
       }
       return ans;
    }
}