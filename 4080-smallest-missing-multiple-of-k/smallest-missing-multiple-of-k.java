class Solution {
    public int missingMultiple(int[] nums, int k) {
        int i=k ; 
        
        HashSet<Integer> set = new HashSet<>();
        for(int j=0 ; j<nums.length ; j++){
            set.add(nums[j]);
        }
        while(set.contains(i)){
            i+=k ;
            
        }
        return i ; 
    }
}