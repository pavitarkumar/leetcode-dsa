class Solution {
    public int reverseDegree(String s) {
        int l = s.length();
        int ans = 0;
        for(int i = 1;i <= l ;i++){
            int b = s.charAt(i-1)-'a';
            ans += (26-b)*i;
        }
        return ans;
    }
}