class Solution {
    public boolean canJump(int[] nums) {
        boolean[] status = new boolean[nums.length];
        status[nums.length-1]= true ;
        for(int i = nums.length-2 ; i>=0 ; i--){
            int maxJump = nums[i];
            for(int j = i+1 ; j<=Math.min(nums.length - 1, i + maxJump) ; j++){
                if(status[j]==true){
                    status[i]=true ;
                    break ;
                }

            }
        }
        return status[0]==true ?true : false ; 
    }
}