class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length - 1];
        int index = 0;
        for (int num = smallest; num <= largest; num++) {
            if (index < nums.length && nums[index] == num) {
                index++;
            } else {
                ans.add(num);
            }
        }

        return ans;
    }
}
