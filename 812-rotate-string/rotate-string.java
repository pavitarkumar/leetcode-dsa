class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if(n != goal.length()) return false;
        for(int i = 0;i < n;i++){
            if(s.charAt(i) != goal.charAt(0)) continue;
            int j = 0;
            int st = i;
            while(j < n && s.charAt(st%n) == goal.charAt(j)){
                    j++;
                    st++;
            }
            if(j == n) return true;
        }
        return false;
    }
}