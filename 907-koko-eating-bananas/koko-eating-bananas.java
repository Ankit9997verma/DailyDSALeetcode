class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int end =0 ; 
      
        for(int i =0 ; i< piles.length ; i++){
            end = Math.max(end , piles[i]);
        }
        int answer = end ;
        int start =1 ; 
        while(start <= end){
            int mid = start + (end - start) /2;

            if(ans(piles , mid , h)){
                end = mid-1 ;
                answer = Math.min(answer , mid);

            }else{
                start = mid +1 ; 
            }
            
        }
            return answer ; 
    }
    public boolean ans (int[] piles , int mid , int h ){
        double sol =0 ;
        for(int pile : piles){
          sol +=  Math.ceil((double) pile / mid);
        }
        if(sol <= h) return true ;
        return false ;
    }
}