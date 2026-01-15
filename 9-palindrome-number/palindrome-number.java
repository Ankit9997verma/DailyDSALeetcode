class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int original = x;
        int ans = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7))
                return false;

            ans = ans * 10 + digit;
        }

        return original == ans;
    }
}
