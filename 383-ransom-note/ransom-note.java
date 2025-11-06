class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character , Integer> map= new HashMap<>();
        HashMap<Character , Integer> map2= new HashMap<>();

        if(ransomNote.length()>magazine.length()){
            return false;
        }
        for(char ch1 : magazine.toCharArray()){
            map.put(ch1, map.getOrDefault(ch1,0)+1);
        }
        for(int i =0 ; i< ransomNote.length() ; i++){
            char ch = ransomNote.charAt(i);
           if(map.containsKey(ch)&&map.get(ch)>0){
            map.put(ch,map.getOrDefault(ch,0)-1);
           }
           else{
            return false;
           }
        }
        return true ;
    }
}