class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length ;
        int largest=0;
        for(int i=0 ; i<=n-3; i++){
            int a=nums[i];
            int b= nums[i+1];
            int c=nums[i+2];

            if(a+b>c && b+c >a && c+a>b){
                int sum = a+b+c;
                largest=Math.max(largest, sum);
            }
        }
        return largest;
    }
}