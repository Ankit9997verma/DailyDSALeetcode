class Solution {
    static Integer dp[][];
    public int helper(int[] nums , int target , int sum , int i){
       if(i == nums.length){
    return sum == target ? 1 : 0;
}
        if(sum > target) return 0;
        if(dp[i][sum] != null) return dp[i][sum];
        return dp[i][sum]= helper(nums, target, sum + nums[i], i + 1) + helper(nums, target, sum, i + 1);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n= nums.length ;
        int sum = 0 ; 
        for(int x : nums){
            sum+=x;
        }
       if (Math.abs(target) > sum || (sum + target) % 2 != 0) {
            return 0;
        }
        int newtarget = (sum + target) /2 ;
        dp = new Integer[n][newtarget +1];
        return helper(nums , newtarget ,0,0);
    }
}