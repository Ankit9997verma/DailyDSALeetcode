class Solution {
    public int maximumScore(int[] nums, int k) {
        int minVal = nums[k];
        int ans = nums[k];
        int left =  k ; 
        int right =k ; 

        while(left > 0 || right < nums.length -1){
            if(left==0 ) right++;
            else if(right == nums.length -1) left--;
            else if(nums[left-1] > nums[right+1]) left--;
            else right++;

            minVal = Math.min(minVal , Math.min(nums[left] , nums[right]));
            ans = Math.max(ans , minVal*(right - left + 1)) ;

        }
        return ans ; 
    }
}