class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;
        int n = 0;
        while(i<=n){
            
            if(i == nums.length - 1) return true;
            n = Math.max(n, i + nums[i]);
            i++; 
        }
        if(i>nums.length-1) return true;
        return false;
    }
}