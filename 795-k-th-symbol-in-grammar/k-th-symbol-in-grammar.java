class Solution {
    public int kthGrammar(int n, int k) {
        if(n == 1) return 0;
        if(k%2 == 0){
            int ans = kthGrammar(n-1,k/2);
            return (ans == 0) ? 1 : 0;
        }else{
            return kthGrammar(n-1,k/2+1);
        }
    }
}