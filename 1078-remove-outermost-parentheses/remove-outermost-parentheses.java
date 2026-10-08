class Solution {
    public String removeOuterParentheses(String s) {
        // int d = 0;
        Stack<Integer> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(st.size() > 0){
                    ans.append(ch);
                }
                st.push(0);
            }else{
                st.pop();
                if(st.size() > 0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}