class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int buyprice = INT_MAX;
        int Maxprofit = 0;
        for(int i = 0;i < prices.size();i++){
            if(buyprice < prices[i]){
                Maxprofit = max(Maxprofit,(prices[i] - buyprice));
            }else if(buyprice >= prices[i]){

                buyprice = prices[i];
            }
        }
        return Maxprofit;
    }
};