class Solution {
    private boolean isPalindrome(String s , int i , int j ){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false ;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen =0 ; 
        String ans="";
        for(int i =0 ; i<n ; i++){
            for(int j = i ; j<n ; j++){
                if(isPalindrome(s,i,j)){
                    int len = j-i+1;
                    if(len>maxLen){
                        maxLen = len;
                        ans=s.substring(i, j+1);
                    }
                }
            }
        }
        return ans ;
    }
}