class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if((mid-1 < 0 || nums[mid] != nums[mid-1]) && 
               (mid+1 >= n || nums[mid] != nums[mid+1])){
                return nums[mid];
            }

            if(mid > 0 && nums[mid] == nums[mid-1]){
                mid--;
            }

            if((mid - start) % 2 == 0){
                start = mid + 2;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}