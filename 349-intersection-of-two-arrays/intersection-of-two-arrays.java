class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
       
        for(int num : nums1){
            set.add(num);
        }
        for(int nums:nums2){
              set2.add(nums);
        }
        HashSet<Integer> common= new HashSet<>(set);
        common.retainAll(set2);

        int [] arr= new int[common.size()];
        int i=0; 
        for(int number: common ){
            arr[i++]=number;
        }
        return arr;
        




    }
}