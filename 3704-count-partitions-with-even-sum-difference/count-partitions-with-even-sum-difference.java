class Solution {
    public int countPartitions(int[] nums) {
        int [] prefix= new int [nums.length];
        int [] suffix= new int[nums.length];

        int count=0 ;
        prefix[0]=nums[0];
        suffix[nums.length-1]=nums[nums.length-1];

        for(int i =1 ; i<nums.length ; i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

        for(int i=nums.length-2 ; i>=0 ; i--){
            suffix[i]=suffix[i+1]+nums[i];
        }

        for(int j=0 ; j<nums.length-1; j++){
            if((prefix[j]-suffix[j+1])%2==0){
                count++;
            }
        }
        return count;
    }
}