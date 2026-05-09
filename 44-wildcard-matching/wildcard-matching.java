class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n+1][m+1];
        dp[0][0]=true;

        for(int j = 1; j <= m; j++) {

            if(p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for(int i =1 ; i<=n ; i++){
            for(int j=1 ; j<=m ; j++){
                char s1= s.charAt(i-1);
                char s2= p.charAt(j-1);

                if(s1==s2 || s2== '?'){
                    dp[i][j]= dp[i-1][j-1];
                }else if(s2=='*'){
                    dp[i][j]= dp[i][j-1]|| dp[i-1][j];
                }else{
                    dp[i][j]= false ;
                }
            }
        }
        return dp[n][m];
    }
}