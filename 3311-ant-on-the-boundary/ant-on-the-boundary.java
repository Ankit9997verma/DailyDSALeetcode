class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
            if(ans == 0 ) count++;
        } 
        return count;
    }
}