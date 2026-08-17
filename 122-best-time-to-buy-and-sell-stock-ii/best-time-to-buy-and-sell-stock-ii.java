class Solution {
    public int maxProfit(int[] prices) {
       int buyPrice = prices[0];
       int ans = 0;
       int n = prices.length;
       for(int i = 1;i < n;i++){
         if(buyPrice > prices[i]){
            buyPrice = prices[i];
         }else{
            ans += prices[i] - buyPrice;
            if(i < n-1){
                buyPrice = prices[i];
            }
         }
       }
       return ans;
    }
}