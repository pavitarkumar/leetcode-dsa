class Solution {
    public static void genrate(List<String> fans,StringBuilder ans,int o,int c){
        if(o==0 && c == 0){
            fans.add(ans.toString());
            return;
        }
        if(o > c || o < 0 || c < 0) return;
        ans.append('(');
        genrate(fans,ans,o-1,c);
        ans.deleteCharAt(ans.length() - 1);
        ans.append(')');
        genrate(fans,ans,o,c-1);
        ans.deleteCharAt(ans.length() - 1);

    }
    public List<String> generateParenthesis(int n) {
        List<String> fans = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        genrate(fans,ans,n,n);
        return fans;
    }
}