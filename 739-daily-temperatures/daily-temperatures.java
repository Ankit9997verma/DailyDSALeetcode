class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] ans= new int[nums.length];
        for(int i =0 ; i<n ; i++){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                int prev= st.pop();
                ans[prev]=i-prev;
            }
            st.push(i);
        }
        return ans;
    }
}
























