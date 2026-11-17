class Solution {
    public static String helper(String ori,String ans,int k){
        int len = ori.length();
        if(len == 0) return ans;
        int fact = 1;
        for(int i = 2;i < len;i++){
            fact *= i;
        }
        int ko = k-1;
        int idx = ko/fact;
        int nq = (ko%fact) + 1;
        String left = ori.substring(0,idx);
        String right = ori.substring(idx+1);
        return helper(left+right,ans+ori.charAt(idx),nq);
    }
    public String getPermutation(int n, int k) {
        String orignal = new String();
        for(int i = 1;i <= n;i++){
            orignal += i;
        }
        return helper(orignal,"",k);
    }
}