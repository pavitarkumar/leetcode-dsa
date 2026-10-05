class Solution {
    public int scoreOfParentheses(String s) {
        Stack <Integer> st = new Stack<>();
        st.push(0);
        for(char ch : s.toCharArray()){
            if(ch == '(') st.push(0);
            else{
                int t = st.pop();
                if(t == 0) t = 1;
                else{ t = 2 * t;}
                st.push(st.pop() + t);
            }
        }
        return st.peek();
    }
}