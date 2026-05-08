class Solution {
    static Integer dp[][];
    public int helper(int[] coins , int amount , int n){
        if(n==0) return -1;
        if(amount ==0) return 0;
        
       if(dp[n][amount] != null) {
            return dp[n][amount];
        }
        
        int take =-1;
        if(coins[n-1] <= amount){
            int res = helper(coins , amount - coins[n-1] , n);
            if(res!= -1) take = 1+ res;
        }
        int nottake = helper(coins , amount , n-1);

        if(take == -1 && nottake == -1) {
            return dp[n][amount] = -1;
        }
        if(take == -1) {
            return dp[n][amount] = nottake;
        }
        if(nottake == -1) {
            return dp[n][amount] = take;
        }

        return dp[n][amount] =
            Math.min(take, nottake);
        
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length ;
        dp = new Integer[n+1][amount+1];
        return helper(coins, amount , n);
    }
}