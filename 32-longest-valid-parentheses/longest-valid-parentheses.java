class Solution{
    public int longestValidParentheses(String s){
        Stack<Integer> st= new Stack<>();
        int count=0; 
        st.push(-1);
        for(int i =0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
               count=Math.max(count , i-st.peek());
                }
                
            }
        }
        return count ; 
    }
 }

 /* class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == '(' && ch == ')') {
                count += 2;
                st.pop();
                
            } else {
                st.push(ch);
            }
        }
        return count;
    }
} */


/* 
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1); 
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else { 
                    maxLen = Math.max(maxLen, i - st.peek());
                }
            }
        }
        return maxLen;
    }
}
 */

