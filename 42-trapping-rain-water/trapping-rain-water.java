class Solution {
    public int trap(int[] height) {
        int l = height.length;
        int rightMax[] = new int[l];
        rightMax[l-1] = height[l-1];
        for(int i = l-2;i >= 0 ;i--){
            if(height[i] > rightMax[i+1]){
                rightMax[i] = height[i];
            }else{
                rightMax[i] = rightMax[i+1];
            }
        }
        int leftMax = 0;
        int ans = 0;
        for(int i = 0;i < l;i++){
            if(leftMax > height[i]){
                ans += Math.min(leftMax,rightMax[i])-height[i];
            }else{
                leftMax = height[i];
            }
        }
        return ans;
    }
}