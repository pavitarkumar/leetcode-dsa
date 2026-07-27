class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minprice = prices[0];
        int Maxprofit = 0;
        for(int i = 1;i < prices.size();i++){
            minprice = min(minprice,prices[i]);
            Maxprofit = max(Maxprofit,prices[i] - minprice);
;        }
        return Maxprofit;
    }
};