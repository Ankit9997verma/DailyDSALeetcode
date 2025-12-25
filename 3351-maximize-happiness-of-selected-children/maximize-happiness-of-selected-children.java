class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        
        long sum = 0;
        int turns = 0;
        int n = happiness.length;
        
        for (int i = n - 1; i >= 0 && turns < k; i--) {
            int value = happiness[i] - turns;
            if (value < 0) value = 0;
            sum += value;
            turns++;
        }
        
        return sum;
    }
}
