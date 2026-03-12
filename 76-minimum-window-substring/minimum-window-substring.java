class Solution {
    public String minWindow(String s, String t) {
      HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }
        int count = map.size();
        int i = 0;
        int j = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while( j < s.length() ){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch)-1);
                if(map.get(ch)==0){
                    count--;
                }
            }
            while(count == 0){
                if(j-i+1 < minLen){
                    minLen=j-i+1;
                    start=i;
                }
                char left = s.charAt(i);
                if(map.containsKey(left)){
                    map.put(left, map.get(left) + 1);

                    if(map.get(left) > 0){
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
        if(minLen == Integer.MAX_VALUE) return "";

        return s.substring(start, start + minLen);
    }
}