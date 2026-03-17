class Solution {

    public void solve(int[] nums, int index, 
                      List<List<Integer>> ans, 
                      List<Integer> list) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        solve(nums, index + 1, ans, list);
        list.remove(list.size() - 1);
        solve(nums, index + 1, ans, list);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, 0, ans, new ArrayList<>());
        return ans;
    }
}