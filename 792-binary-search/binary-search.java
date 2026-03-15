class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (target < arr[mid]) {
            return binarySearch(arr, start, mid - 1, target);
        } else {
            return binarySearch(arr, mid + 1, end, target);
        }
    }
}
