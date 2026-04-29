class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        for(int i =0 ; i<s.length() ; i+=2*k){
            int end = Math.min(i+k , s.length());
           String firstPart = new StringBuilder(s.substring(i,end)).reverse().toString();
           result.append(firstPart);

           if(end < s.length()){
            int nextEnd = Math.min(i+2*k , s.length());
            result.append(s.substring(end , nextEnd));
           }
        }
        return result.toString();
    }
}