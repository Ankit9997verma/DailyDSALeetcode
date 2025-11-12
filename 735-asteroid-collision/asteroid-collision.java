
class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            while (!st.isEmpty() && st.peek() > 0 && curr < 0) {
                if (Math.abs(st.peek()) < Math.abs(curr)) {
                    st.pop();
                    continue; 
                } else if (Math.abs(st.peek()) == Math.abs(curr)) {
                    st.pop();
                }
                curr = 0; 
                break;
            }

            if (curr != 0) {
                st.push(curr);
            }
        }

        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}
