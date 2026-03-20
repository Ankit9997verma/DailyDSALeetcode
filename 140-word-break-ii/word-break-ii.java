class Solution {
    public void helper(String s , HashSet<String> set , List<String> list , List<String> res , int start  ){
        if(start == s.length()){
            StringBuilder temp = new StringBuilder();
            for(int i = 0;i<list.size();i++){
                temp.append(list.get(i));
                if(i != list.size()-1){
                    temp.append(" ");
                }
            }
            res.add(temp.toString());
            return ;
        }
        
        for(int i = start ; i<s.length() ; i++){
           String word = s.substring(start,i+1);
            if(set.contains(word)){
                list.add(word);
                helper(s , set , list , res , i+1);
                list.remove(list.size()-1);
            }
        }
    }
    public List<String> wordBreak(String s, List<String> w) {
        List<String> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(String word:w) set.add(word);
        helper(s , set , new ArrayList<>() ,res , 0);
        return res;
    }
}






