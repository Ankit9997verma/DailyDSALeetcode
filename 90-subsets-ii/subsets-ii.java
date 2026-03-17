class Solution {
    public void helper(int[] nums , List<List<Integer>> ans , List<Integer>list , int start){
        if(start==nums.length){
            
            return ;
        }
        for(int i=start ; i<nums.length ; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            ans.add(new ArrayList<>(list));
            helper(nums , ans , list , i+1 );
            list.remove(list.size()-1);
        }

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        List<Integer>list = new ArrayList<>();
        helper(nums , ans , list , 0);
        return ans;
    }
}