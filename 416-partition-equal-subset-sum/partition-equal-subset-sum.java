class Solution {
    Boolean dp[][] ; 
    public boolean helper(int[] nums , int sum , int target , int i){
        if(target== sum){
            return true ;
        }
        if(i== nums.length || target > sum) return false ;
        if(dp[i][target]!= null) return dp[i][target] ;

        return dp[i][target] = helper(nums , sum , target+nums[i] , i+1)|| helper(nums , sum , target , i+1);
    }
    public boolean canPartition(int[] nums) {
        
        int sum =0 ; 
        for(int i =0 ;i< nums.length ; i++){
            sum += nums[i];
        }
       if(sum %2 !=0) return false ;
       int target = sum/2;

       dp= new Boolean[nums.length][target+1];

       return helper(nums , target , 0 , 0);
    }
}