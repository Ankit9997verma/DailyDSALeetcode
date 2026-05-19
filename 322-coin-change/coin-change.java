class Solution {

    int[][] dp;

    public int helper(int[] coins, int amount, int n) {

        // amount formed
        if(amount == 0)
            return 0;

        // no coins left
        if(n == 0)
            return Integer.MAX_VALUE - 1;

        // already computed
        if(dp[n][amount] != -1)
            return dp[n][amount];

        // take coin
        if(coins[n - 1] <= amount) {

            return dp[n][amount] = Math.min(

                    1 + helper(coins,
                               amount - coins[n - 1],
                               n),

                    helper(coins,
                           amount,
                           n - 1)
            );
        }

        // skip coin
        return dp[n][amount] =
                helper(coins,
                       amount,
                       n - 1);
    }

    public int coinChange(int[] coins, int amount) {

        int n = coins.length;

        dp = new int[n + 1][amount + 1];

        for(int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = helper(coins, amount, n);

        return ans >= Integer.MAX_VALUE - 1
                ? -1
                : ans;
    }
}