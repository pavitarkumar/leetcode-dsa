class Solution {
    public int countSegments(String s) {
        if(s.length() == 0) return 0;
        int ans = 0;
        if(s.charAt(0) != ' ') ans++;
        for(int i = 0;i < s.length();i++){
            if(i > 0){
                if((s.charAt(i) != ' ') && s.charAt(i-1) == ' '){
                ans++;
            }
            }

        }
        return ans;
    }
}