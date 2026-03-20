class Solution {
    public void helper(String digits , String[] map , List<String> ans , StringBuilder sb , int index){
        if(index==digits.length()){
            ans.add(sb.toString());
            return ;
        }
        int digit = digits.charAt(index)-'0';
        String letters = map[digit];

        for(int i =0 ; i < letters.length(); i++){
            sb.append(letters.charAt(i));
             helper(digits, map, ans, sb, index + 1); 
            sb.deleteCharAt(sb.length() - 1);  
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
         if (digits == null || digits.length() == 0) {
            return ans;
        }
         String[] map = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };
          helper(digits, map, ans, new StringBuilder(), 0);

        return ans;
    }
}