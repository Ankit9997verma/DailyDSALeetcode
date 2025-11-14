class Solution {
    
    public  int helper(String s1 , String s2 , int i , int j , Integer [][] dp){
        if(i==s1.length()|| j==s2.length()){
            return 0 ;
        }
        if(dp[i][j]!=null)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+ helper(s1,s2,i+1,j+1,dp);
        }
        return dp[i][j]=Math.max(helper(s1,s2,i+1,j,dp),helper(s1,s2,i,j+1,dp));
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int i =0 ; 
        int j =0;
        Integer[][] dp=new Integer[s1.length()+1][s2.length()+1];
       return  helper(s1,s2,i, j, dp);
      
    }
}