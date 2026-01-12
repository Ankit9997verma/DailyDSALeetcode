class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
         int  i=0 ; 
        
        // while(i<nums.length){
        //      int j =0 ; 
             
        //     while(j< groups.length){
        //         int[] number= groups[j];
        //         int k =0 ;
        //         while( k< number.length ){
        //             if(number[k]==nums[i]){
        //                 k++;
        //                 i++;
        //             }else{
        //                 i++;
        //             }
        //         }
        //         j++;
                
        //     }
        //     return false ;
        // }
        // return true ;

        for(int j =0 ; j<groups.length ; j++){
            int[] number = groups[j];
            boolean matched= false ; 

            while(i+number.length <=   nums.length ){
                int k=0; 
                while(k< number.length && nums[i+k]==number[k]){
                    k++;
                }
                if(k==number.length){
                    i=i+number.length;
                    matched=true;
                    break;
                }else{
                    i++;
                }
            }
            if(!matched) return false ;
        }
        return true ;
        
    }
}