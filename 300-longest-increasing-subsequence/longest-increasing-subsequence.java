class Solution {
    public int lengthOfLIS(int[] nums) {
        int [] dp = new int[nums.length];
        dp[0]= 1;
        int max=1;
        for(int i = 1  ; i < nums.length ; i++){
            int curr =0 ; 
            for(int j =0 ; j< i ; j++){
                if(nums[j]< nums[i]){
                    curr=Math.max(curr , dp[j]);
                }
            }
            dp[i]=curr+1;
            max=Math.max(max , dp[i]);
        }
        return max ; 
    }
}