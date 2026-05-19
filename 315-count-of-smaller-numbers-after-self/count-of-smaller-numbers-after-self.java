class Solution {

    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;

        int[] index = new int[n];

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            index[i] = i;
            result.add(0);
        }

        mergeSort(index, 0, n - 1, result, nums);

        return result;
    }

    private void mergeSort(int[] index, int left, int right,
                           List<Integer> result, int[] nums) {

        if(left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(index, left, mid, result, nums);
        mergeSort(index, mid + 1, right, result, nums);

        merge(index, left, mid, right, result, nums);
    }

    private void merge(int[] index, int left, int mid, int right,
                       List<Integer> result, int[] nums) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int i = 0; i < n1; i++) {
            leftArr[i] = index[left + i];
        }

        for(int j = 0; j < n2; j++) {
            rightArr[j] = index[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        int rightCount = 0;

        while(i < n1 && j < n2) {

            if(nums[rightArr[j]] < nums[leftArr[i]]) {

                rightCount++;

                index[k++] = rightArr[j++];

            } else {

                result.set(
                    leftArr[i],
                    result.get(leftArr[i]) + rightCount
                );

                index[k++] = leftArr[i++];
            }
        }

        while(i < n1) {

            result.set(
                leftArr[i],
                result.get(leftArr[i]) + rightCount
            );

            index[k++] = leftArr[i++];
        }

        while(j < n2) {
            index[k++] = rightArr[j++];
        }
    }
}