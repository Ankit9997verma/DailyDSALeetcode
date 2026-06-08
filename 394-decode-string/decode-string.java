class Solution {
        int idx=0;
    public String decodeString(String s) {
        return helper(s).toString();

    }
    private StringBuilder helper(String s ){
        StringBuilder res = new StringBuilder();
        while(idx < s.length() && s.charAt(idx) !=']'){
            char ch = s.charAt(idx);

            if(Character.isDigit(ch)){
                int num =0 ;
                while(idx < s.length() && Character.isDigit(s.charAt(idx))){
                    num = num*10 + (s.charAt(idx) -'0');
                    idx++;
                }
                idx++;
                StringBuilder decoded = helper(s);
                idx++;

                for(int i=0 ; i< num ; i++){
                    res.append(decoded);
                }
            }
            else{
                res.append(ch);
                idx++;
            }
        }
        return res;
    }
}