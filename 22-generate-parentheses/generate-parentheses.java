class Solution {
    public void helper(int open , int close , ArrayList<String> list , StringBuilder sb ){
        if(open == 0 && close ==0){
            list.add(sb.toString());
            return ;
        }
        if(open > 0){
            StringBuilder op = new StringBuilder(sb);
            op.append('(');
            helper(open-1 ,close , list , op);
        }
        if(close >open){
            StringBuilder op2 = new StringBuilder(sb);
            op2.append(')');
            helper(open , close-1 ,list , op2);
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        int open = n-1 ; 
        int close = n;
        helper( open , close , list , sb);
        return list ;
    }
}