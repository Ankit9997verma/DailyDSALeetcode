class Solution {
    public int findMin(int[] nums) {
        int start =0 ; 
        int end = nums.length -1 ; 
        int n = nums.length;
        while(start <= end ){
            int mid = start + (end -start)/2;
            if( nums[mid]<= nums[(mid+1)%n] &&  nums[mid]<= nums[(mid-1+n)%n]){
                return nums[mid] ; 
            }
            else if( nums[0] <= nums[mid] ){
                start = mid+1;
            }else if(nums[mid] <= nums[end]){
                end = mid-1;
            }
        }
        return nums[0];
    }
}