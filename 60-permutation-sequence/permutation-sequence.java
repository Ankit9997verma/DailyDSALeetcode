class Solution {
    int count = 0;
    String result = "";

    void helper(List<Integer> nums, boolean[] used, StringBuilder sb, int k) {
        if (sb.length() == nums.size()) {
            count++;
            if (count == k) {
                result = sb.toString();
            }
            return;
        }

        for (int i = 0; i < nums.size(); i++) {
            if (!used[i]) {
                used[i] = true;
                sb.append(nums.get(i));
                helper(nums, used, sb, k);
                sb.deleteCharAt(sb.length() - 1);
                used[i] = false;
            }
        }
    }

    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) nums.add(i);
        helper(nums, new boolean[n], new StringBuilder(), k);
        return result;
    }
}
