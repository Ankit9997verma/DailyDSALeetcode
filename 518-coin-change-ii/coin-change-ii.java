class Solution {
    Integer dp[][];
    public int helper(int amount , int[] coins , int n){
        if(n== 0) return 0;
        if(amount == 0) return 1;
        if(dp[n][amount] != null) return dp[n][amount];
        int take =0 ; 
        if(coins[n-1] <= amount){
         take = helper(amount- coins[n-1] , coins , n);
        }

        int nottake = helper(amount , coins , n-1);

        return dp[n][amount]= take + nottake ;

        
    }
    public int change(int amount, int[] coins) {
        int n = coins.length ;
        dp = new Integer[n+1][amount+1];
        return helper(amount , coins , n);
    }
}