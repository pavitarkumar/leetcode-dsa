import java.util.Stack;
class Solution {
    public int maxDepth(String s) {
        int fans = 0;
        int ans = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '(') ans+=1;
            else if(s.charAt(i) == ')'){
                ans--;
            }
            fans = Math.max(ans,fans);
        }
        return fans;
    }
}