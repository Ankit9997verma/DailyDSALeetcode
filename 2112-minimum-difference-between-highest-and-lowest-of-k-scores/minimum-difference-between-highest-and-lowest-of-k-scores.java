class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1) return 0;
        Arrays.sort(nums);
        int i =0;
        int j = k-1;
        int mini = Integer.MAX_VALUE;
        while(j<nums.length){
            mini=Math.min(mini,nums[j]-nums[i]);
            i++;
            j++;
        }
        return mini;

    }
}