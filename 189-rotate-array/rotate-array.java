class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length ;
        int [] nums1 = new int[n];
        for(int i =0 ; i< n ; i++){
            nums1[i]= nums[i];
        }

        for(int i =0 ; i<nums.length ; i++){
           nums[(i+k)%nums.length]=nums1[i];
        }
         
    }
}