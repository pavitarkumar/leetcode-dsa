class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String str = countAndSay(n-1) ;
        int len = str.length();
        char ch = str.charAt(0);
        String ztr = "";
        int freq = 0;
        for(int i = 0;i < len;i++){
            char dh = str.charAt(i);
            if(ch == dh){
                freq += 1;
            }else{
                ztr = ztr + freq + ch;
                freq = 1;
                ch = dh;
            }
        }
        ztr = ztr + freq + ch;
        return ztr;
    }
}