class Solution {
    public boolean checkDivisibility(int n) {
        int t = n;
        int sum = 0;
        int product = 1;
        while(n > 0){
            product *= n%10;
            sum += n%10;
            n /= 10;
        }
        sum += product;
        if(t % sum == 0) return true;
        else return false;
    }
}