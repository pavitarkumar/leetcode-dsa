class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int u = 0;
        int l = 0;
        for(int i = 0;i < n;i++){
            if(Character.isUpperCase(word.charAt(i))) u++;
            else l++;
        }
        if(l == n || u == n) return true;
        if(n > 1 && Character.isUpperCase(word.charAt(0)) && l == n - 1) return true;
        return false;
    }
}