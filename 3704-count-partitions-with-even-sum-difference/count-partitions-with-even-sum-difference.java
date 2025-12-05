class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        int count=0;
        for(int element:nums){
            sum+=element;
        }
        int som=0;
        for(int i=0;i<nums.length-1;i++){
           int check= nums[i]+som;
            if((check-(sum-check))%2==0){
                count++;
                som+=nums[i];
            }
        }
        return count;
        
    }
}