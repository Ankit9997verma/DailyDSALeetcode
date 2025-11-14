class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] stp=path.split("/");
        for(String str: stp ){
            if(str.isEmpty() || str.equals(".")){
                continue;
            }else if(str.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(str);
            }
        }
        if(st.isEmpty()){
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for(String stt: st){
            sb.append("/").append(stt);
        }
        return sb.toString();
    }
}








