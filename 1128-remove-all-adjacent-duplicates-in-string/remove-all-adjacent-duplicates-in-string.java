class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i =0 ; i< n ; i++){
        
            if( !st.isEmpty() && st.peek()==s.charAt(i)){
                 st.pop();
            }else{
                 st.push(s.charAt(i));
            }
             
        
       
              

        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();

    }
}