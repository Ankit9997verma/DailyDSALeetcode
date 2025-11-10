class Solution {
    int count = 0;

    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums); 
        backtrack(nums, k, 0, new HashMap<>());
        return count - 1; 
    }

    private void backtrack(int[] nums, int k, int index, HashMap<Integer, Integer> map) {

        if (index == nums.length) {
            count++;
            return;
        }

        backtrack(nums, k, index + 1, map);
        int num = nums[index];
        if (!map.containsKey(num - k) && !map.containsKey(num + k)) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            backtrack(nums, k, index + 1, map);

            map.put(num, map.get(num) - 1);
            if (map.get(num) == 0) {
                map.remove(num);
            }
        }
    }
}
