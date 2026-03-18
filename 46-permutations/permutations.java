// class Solution {
//     public void helper(int[] nums, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> ans) {
//         if (nums.length == 0) {
//             list.add(new ArrayList<>(ans));
//             return;
//         }

//         HashSet<Integer> set = new HashSet<>();

//         for (int i = 0; i < nums.length; i++) {
//             if (set.contains(nums[i])) continue;
//             set.add(nums[i]);
//             int[] remaining = new int[nums.length - 1];
//             int k = 0;
//             for (int j = 0; j < nums.length; j++) {
//                 if (j != i) {
//                     remaining[k++] = nums[j];
//                 }
//             }

//             ArrayList<Integer> newAns = new ArrayList<>(ans);
//             newAns.add(nums[i]);

//             helper(remaining, list, newAns);
//         }
//     }

//     public List<List<Integer>> permute(int[] nums) {
//         ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//         helper(nums, list, new ArrayList<>());
//         return new ArrayList<>(list);
//     }
// }

//above approach is of recursion 
class Solution {
    public void helper(int[] nums, List<List<Integer>> list, int index) {
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            list.add(temp);
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = index; i < nums.length; i++) {
            // avoid duplicates
            if (set.contains(nums[i])) continue;
            set.add(nums[i]);

            // choose (swap)
            swap(nums, i, index);

            // explore
            helper(nums, list, index + 1);

            // undo (backtrack)
            swap(nums, i, index);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(nums, list, 0);
        return list;
    }
}