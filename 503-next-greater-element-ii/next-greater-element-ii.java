class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int res[] =new int[nums.length];
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        for(int i=n*2-1; i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=(nums[i%n])){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()){
                    res[i]=-1;

                }else{
                    res[i]=stack.peek();
                }
            }
            stack.push(nums[i%n]);

        }
        return res;

        
    }
}