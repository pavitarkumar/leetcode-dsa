class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(0);
            }else{
                int t = stack.pop();
                if(t == 0) t = 1;
                else{t = 2 * t;}
                
                stack.push(stack.pop() + t);
            }
        }
        return stack.peek();
    }
}