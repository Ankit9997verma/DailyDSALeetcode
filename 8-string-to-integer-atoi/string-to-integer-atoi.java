
class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        int sign = 1, result = 0;
        int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;

        while (i < n && s.charAt(i) == ' ') i++;

        if (i < n) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';


            if (result > (max - digit) / 10) {
                return sign == 1 ? max : min;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}

