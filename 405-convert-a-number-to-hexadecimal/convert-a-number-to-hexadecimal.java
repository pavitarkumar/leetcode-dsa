class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        String s = "0123456789abcdef";
        String ans  = "";
        while(num != 0){
            int n = num&15;
            ans = s.charAt(n) + ans;
            num >>>= 4;
        }
        return ans;
    }
}