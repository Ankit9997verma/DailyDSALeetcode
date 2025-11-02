class Solution {
    public void helper(int nums[], List<List<Integer>> ans , List<Integer> curr , int i){
           ans.add(new ArrayList<> (curr));
           for(int j=i; j<nums.length ; j++){
             if(j>i && nums[j]==nums[j-1]) continue;
             curr.add(nums[j]);
             helper(nums,ans , curr, j+1);
             curr.remove(curr.size()-1);
           }
            

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        helper(nums, ans , curr , 0);
        return ans;
    }
}