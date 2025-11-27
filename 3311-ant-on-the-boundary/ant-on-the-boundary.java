class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int[] prefix= new int[nums.length];
        int count =0 ;
        prefix[0]=nums[0];
        for(int i =1 ; i<nums.length; i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int j=0 ; j<nums.length ; j++){
            if(prefix[j]==0){
                count = count+1 ;
            }
        }
        return count ; 
    }
}