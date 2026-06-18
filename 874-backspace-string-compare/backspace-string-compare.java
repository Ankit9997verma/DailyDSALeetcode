import java.util.*;

class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();

      
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }

       
        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            } else {
                st1.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        while (!st1.isEmpty()) {
            sb1.append(st1.pop());
        }

        return sb.toString().equals(sb1.toString());
    }
}