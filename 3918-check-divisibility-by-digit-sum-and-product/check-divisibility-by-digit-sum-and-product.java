class Solution {
    public boolean checkDivisibility(int n) {
        int t = n;
        int sum = 0;
        int product = 1;
        while(n > 0){
            int a = n%10;
            product *= a;
            sum += a;
            n /= 10;
        }
        sum += product;
        if(t % sum == 0) return true;
        else return false;
    }
}