class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum =0 ; 
        int count =0;
        for(int i =0 ; i< nums.length ; i++){
            if(nums[i]==1){
                sum++;
            }else{
                
                sum=0;
            }
            count=Math.max(sum ,count );

        }
        return count ; 
    }
}