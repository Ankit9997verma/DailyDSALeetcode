class Solution {
    public void helper(int[] nums, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> ans) {
        if (nums.length == 0) {
            list.add(new ArrayList<>(ans));
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) continue;
            set.add(nums[i]);

            // create remaining array
            int[] remaining = new int[nums.length - 1];
            int k = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    remaining[k++] = nums[j];
                }
            }

            ArrayList<Integer> newAns = new ArrayList<>(ans);
            newAns.add(nums[i]);

            helper(remaining, list, newAns);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        helper(nums, list, new ArrayList<>());
        return new ArrayList<>(list);
    }
}