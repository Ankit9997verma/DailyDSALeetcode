class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] nums1 = new int[3];

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) nums1[0]++;
            if (nums[i] == 1) nums1[1]++;
            if (nums[i] == 2) nums1[2]++;
        }

        int index = 0;

        for (int j = 0; j < 3; j++) {
            while (nums1[j] > 0) {
                nums[index] = j;
                index++;
                nums1[j]--;
            }
        }
    }
}
