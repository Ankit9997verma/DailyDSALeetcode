class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum =0 ; 
       
        for(int i =0 ; i< nums.length ; i++){
             int currentcount=0;
            int currentsum=0;
            for(int j =1 ; j<= nums[i] ; j++){
              
                if(nums[i]%j==0){
                     currentcount=currentcount+1;
                     currentsum=currentsum+j;
                     
                }
                if(currentcount>4) break;
                
            }
            if(currentcount==4){
                sum+=currentsum;
            }
        }
        return sum ; 
    }
}