class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(') st.push(0);
            else{
                if(!st.empty() && st.peek() == 0)  st.pop();
                else st.push(1);
            }
        }
        return st.size();
    }
}