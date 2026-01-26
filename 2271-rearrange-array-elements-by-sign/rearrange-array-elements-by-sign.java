class Solution {
    public int[] rearrangeArray(int[] nums) {
       ArrayList<Integer> list = new ArrayList<>();
       ArrayList<Integer> list2 = new ArrayList<>();

       for(int i =0 ; i< nums.length ; i++){
        if(nums[i]>=0){
            list.add(nums[i]);
        }else{
            list2.add(nums[i]);
        }
       }
       
       for(int i =0 ; i< nums.length ; i++){
         if(i%2 == 0){
            nums[i]=list.get(i/2);
         }else{
            nums[i]=list2.get(i/2);
         }
       }
       return nums;
    }
}