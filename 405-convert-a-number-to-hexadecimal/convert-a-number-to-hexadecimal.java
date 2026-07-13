class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        String s = "0123456789abcdef";
        StringBuilder result = new StringBuilder();

        while (num != 0) {
            result.append(s.charAt(num & 15)); // Last 4 bits
            num >>>= 4;                   // Unsigned right shift
        }
        return result.reverse().toString();
    }
}