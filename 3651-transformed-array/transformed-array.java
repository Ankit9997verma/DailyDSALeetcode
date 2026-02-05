class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length ;
        int[] newArr = new int[n]; 
        for(int i =0 ; i< n ; i++){
            int k = nums[i];
            if(k>0){
            newArr[i]=nums[(i+k)%n];
            }else {
                newArr[i]=nums[(i+k%n+n)%n];
            }
        }
        return newArr;
    }
}