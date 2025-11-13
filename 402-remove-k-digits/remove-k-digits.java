

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for (char ch : num.toCharArray()) {
            while (!st.isEmpty() && st.peek() > ch && k > 0) {
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }
        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }

        String res = sb.substring(i);
        return res.isEmpty() ? "0" : res;
    }
}

