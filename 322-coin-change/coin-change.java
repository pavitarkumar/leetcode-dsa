class Solution {
    public static int helper(int coins[] , int amount, int dp[]){
        if(amount < 0) return Integer.MAX_VALUE;
        if(amount == 0) return 0;
        if(dp[amount] != -1) return dp[amount];

        int fans = Integer.MAX_VALUE;
        for(int i = 0;i < coins.length;i++){
            if(amount < coins[i]) continue;
            int a = helper(coins,amount-coins[i],dp);
            if(a != Integer.MAX_VALUE){
                fans = Math.min(fans,a+1);
            }
        }
        return dp[amount] = fans;
    }
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        Arrays.fill(dp,-1);
        int ans =  helper(coins,amount,dp);
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}