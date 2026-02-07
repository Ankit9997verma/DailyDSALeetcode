
    
    class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (!stack.isEmpty()) {
                    res.append(ch); 
                }
                stack.push(ch);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    res.append(ch);  
                }
            }
        }

        return res.toString();
    }
}
