class Solution {
    public boolean isPalindrome (String s , int left , int right ){
        while(left < right){
            if(s.charAt(left)!=s.charAt(right)){
                return false ;
            }
            left++;
            right--;
        }
        return true ;
    }
    public void helper(String s , List<List<String>> list , List<String> path , int start){
        if(start == s.length()){
            list.add(new ArrayList<>(path));
            return ;
        }
        for(int i = start ; i< s.length() ; i++){
            if(isPalindrome(s,start , i)){
                path.add(s.substring(start , i+1));
                helper(s, list , path , i+1);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> path = new ArrayList<>();
        helper(s , list , path , 0);
        return list ;
    }
}



