class Solution {
    public void helper(String s, ArrayList<String> list, StringBuilder sb) {
        if (s.length() == 0) {
            list.add(sb.toString());
            return;
        }
        char ch = s.charAt(0);
        String remaining = s.substring(1);
        if (Character.isLetter(ch)) {
            StringBuilder op1 = new StringBuilder(sb);
            op1.append(Character.toLowerCase(ch));
            StringBuilder op2 = new StringBuilder(sb);
            op2.append(Character.toUpperCase(ch));

            helper(remaining, list, op1);
            helper(remaining, list, op2);
        } else {
            StringBuilder op = new StringBuilder(sb);
            op.append(ch);
            helper(remaining, list, op);
        }
    }
    public List<String> letterCasePermutation(String s) {
        ArrayList<String> list = new ArrayList<>();
        helper(s, list, new StringBuilder());
        return list;
    }
}