class Solution {
    public int maxProfit(int[] prices) {
       int MaxProfit = 0;
       int n = prices.length;
       for(int i = 1;i < n;i++){
        if(prices[i] > prices[i-1]){
            MaxProfit += prices[i] - prices[i-1];
        }
       }
       return MaxProfit;
    }
}