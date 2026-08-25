class Solution {
    static int[][] dp ;
    static int solve(int[] jd , int n , int idx , int d){
        // base case ....if there is only one day left then we have to do all remaining jobs int that one day and find the max difficulty of thst day and return it ....
        if(d==1){
            int maxD = Integer.MIN_VALUE ;
            for(int i = idx ; i < n ; i++){
                maxD=Math.max(maxD , jd[i]);
            }
            return maxD;
        }
        if (dp[idx][d] != -1) {
            return dp[idx][d];
        }

        int maxD = jd[idx];
        int finalresult =Integer.MAX_VALUE ; 
        // TRY one by one with all possibliluty take idx , and run for rest ...
        for(int i = idx ; i<=n-d ; i++){
            maxD = Math.max(maxD , jd[i]);
            int result = maxD + solve(jd , n , i+1 , d-1 );
            finalresult = Math.min(finalresult , result);

        }
        return dp[idx][d] =finalresult ;
    }
    public int minDifficulty(int[] jd, int d) {
        int n = jd.length ;
        if(d> n) return -1 ;
        dp= new int[n][d+1];
        for(int i =0 ; i< n ; i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(jd , n, 0 , d);
    }
}