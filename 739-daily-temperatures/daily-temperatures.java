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




/* class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty() && temperatures[st.peek()] > temperatures[i]){
                ans[i] = st.peek() - i;
                st.push(i);
            }if(st.isEmpty()){
                ans[i] = 0;
            }
            st.push(i);
        }
        return ans;
    }
} */



















