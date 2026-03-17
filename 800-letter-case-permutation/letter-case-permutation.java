class Solution {
    public void helper(String s , int i , List<String> list , StringBuilder sb){
        if(i == s.length()){
            list.add(sb.toString());
            return;
        }
        char ch = s.charAt(i);
        int len = sb.length();
        if(Character.isLetter(ch)){
           
            helper(s,i+1,list,sb.append(Character.toLowerCase(ch)));
            sb.setLength(len);
            
            helper(s,i+1, list ,sb.append(Character.toUpperCase(ch)));
            sb.setLength(len);
        }else {
            helper(s,i+1 ,list , sb.append(ch));
            sb.setLength(len);
        }
    }
    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        helper(s , 0 , list , new StringBuilder());
        return list ;
    }
}