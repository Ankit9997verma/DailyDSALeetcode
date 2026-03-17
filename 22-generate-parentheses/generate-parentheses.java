class Solution {
    public void helper(int open , int close , ArrayList<String> list , StringBuilder sb){
        if(open==0 && close ==0){
            list.add(sb.toString());
            return;
        }
        int len = sb.length();
        if(open > 0 ){
            helper( open-1 , close , list , sb.append('('));
            sb.setLength(len);
        }
        if(close > open){
            helper( open , close-1 , list , sb.append(')'));
            sb.setLength(len);
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        helper(n-1 , n , list , sb);
        return list ;
    }
}