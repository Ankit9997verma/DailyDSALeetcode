class Solution {
    public int helper(String s , String sbb , int i , int j , Integer[][] dp ){
        if(i==s.length() || j==sbb.length()){
            return 0 ;
        }
        if(dp[i][j]!=null) return dp[i][j];
        if(s.charAt(i)==sbb.charAt(j)){
            return dp[i][j]= 1+helper(s,sbb,i+1,j+1,dp);
        }
        return dp[i][j]= Math.max(helper(s,sbb,i+1,j,dp), helper(s,sbb,i,j+1,dp));
    }
    public int longestPalindromeSubseq(String s) {
      StringBuilder sb = new StringBuilder(s);
       String sbb= sb.reverse().toString();
       Integer[][] dp = new Integer[s.length()+1][s.length()+1];
      return  helper(s,sbb,0,0,dp);
    }
}