class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        StringBuilder sbb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
                sb.append(Character.toLowerCase(ch));
            }
        }

        for(int i = sb.length() - 1; i >= 0; i--){
            sbb.append(sb.charAt(i));
        }

        return sb.toString().equals(sbb.toString());
    }
}
