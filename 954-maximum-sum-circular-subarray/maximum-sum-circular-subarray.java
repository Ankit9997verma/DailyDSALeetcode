class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;

        int curMax = 0, maxSum = nums[0];
        int curMin = 0, minSum = nums[0];

        for (int x : nums) {
            totalSum += x;

          
            curMax = Math.max(x, curMax + x);
            maxSum = Math.max(maxSum, curMax);

        
            curMin = Math.min(x, curMin + x);
            minSum = Math.min(minSum, curMin);
        }


        if (maxSum < 0) return maxSum;

        return Math.max(maxSum, totalSum - minSum);
    }
}
