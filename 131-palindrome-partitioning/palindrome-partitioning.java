class Solution {
    public static boolean ispalindrome(String  str){
        int start =0 ; 
        int end =str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false ;
            }
            start++;
            end--;
            
        }
        return true ;
    }
    public static void helper(String s , List<List<String>> answer , List<String> path, int index ){
        if(index==s.length()){
            answer.add(new ArrayList<>(path));
            return ;
        }
        for(int i =index ; i< s.length() ; i++){
            String sub= s.substring(index, i+1);
            if(ispalindrome(sub)){
                path.add(sub);
                helper(s,answer,path,i+1);
                path.remove(path.size()-1);
            }

        }

    }
    public List<List<String>> partition(String s) {
        List<List<String>> answer= new ArrayList<>();
        List<String> path = new ArrayList<>();
        helper(s , answer ,path , 0);
        return answer;
    }
}

