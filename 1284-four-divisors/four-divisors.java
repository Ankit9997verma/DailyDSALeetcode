class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum =0 ; 
       
        for(int i =0 ; i< nums.length ; i++){
             int currentcount=0;
            int currentsum=0;
            for(int j =1 ; j*j <= nums[i] ; j++){
                if(nums[i]%j==0){
                    if(j==nums[i]/j){
                    currentcount+=1;
                    currentsum+=j;
                    }
                    else{
                        currentcount+=2;
                        currentsum+=j;
                        currentsum+= (nums[i]/j);
                    }
                
                if(currentcount>4) break;
                }
                
            }
            if(currentcount==4){
                sum+=currentsum;
            }
        }
        return sum ; 
    }
}