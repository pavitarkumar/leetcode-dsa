class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftSum = 0 , rightSum = 0;
        int leftQ = 0 , rightQ = 0;
        for(int i = 0;i < n/2;i++){
            if(num.charAt(i) != '?'){
                leftSum += num.charAt(i) - '0';
            }else{
                leftQ++;
            }
        }
        for(int i = n/2;i < n;i++){
            if(num.charAt(i) != '?'){
                rightSum += num.charAt(i) - '0';
            }else{
                rightQ++;
            }
        }
        return (leftSum - rightSum) * 2 != (rightQ - leftQ) * 9;
    }
}