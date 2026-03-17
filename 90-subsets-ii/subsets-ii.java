class Solution {
    public void solve(int[] nums , int i , HashSet<List<Integer>> set , List<Integer>list){
        if(i == nums.length){
             List<Integer> temp = new ArrayList<>(list);
            Collections.sort(temp);
            set.add(temp);
            return;
        }
        list.add(nums[i]);
        solve(nums , i+1 , set , list);
        list.remove(list.size()-1);
        solve(nums , i+1 , set , list);
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        HashSet<List<Integer>> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        solve(nums , 0 , set , list);
        return new ArrayList<>(set);
    }
}