class Solution {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        while(l1 >= 0 || l2 >= 0 || carry > 0){
            int a = 0;
            int b = 0;
            if(l1 >= 0){
                a = num1.charAt(l1) - '0';
            }
            if(l2 >= 0){
                b = num2.charAt(l2) - '0';
            }
            int summ = a+b+carry;
            ans.append(summ%10);
            carry = summ/10;
            l1--;
            l2--;
        }
        return ans.reverse().toString();
    }
}