class Solution {
    public boolean isTrionic(int[] nums) {
       int p=0;
       int q=0;
       int r=0;
       int n = nums.length;
        for(int i=1 ; i<n ; i++){
            if(nums[i]<=nums[i-1]){
                break;
            }
            p=i;
        }
        if(p==0){
            return false;
        }
        for(int i=p+1 ; i<n ; i++){
            if(nums[i-1]<=nums[i]){
                break ;
            }
            q=i;
        }
        if(p>=q || q==n-1){
            return false ;
        }
        for(int i=q+1 ; i< n ; i++){
            if(nums[i]<=nums[i-1]){
                break;
            }
            r=i;
        }
        if(r<n-1){
            return false ;
        }
        return true ;
    }
}