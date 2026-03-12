class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int i =0 ; 
        int j =0 ; 
        int max = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            map.put(ch , map.getOrDefault(ch , 0)+1);
            if(map.size()== j-i+1){
                max=Math.max(max , j-i+1);
                j++;
            }
            else if(map.size()< j-i+1){
                while(map.size() < j-i+1){
                    char left = s.charAt(i);
                    map.put(left , map.get(left)-1);
                    if(map.get(left)==0){
                        map.remove(left);
                    }
                    i++;
                }
                j++;
            }

            
        }
        return max ;
    }
}