class Solution {
    public String frequencySort(String s) {
    //    int [] chara = new int[26];
    //    StringBuilder sb = new StringBuilder();
    //    for(int i=0 ; i<s.length() ; i++){
    //        if(s.charAt(i)>='a' || s.charAt(i)<='z' ) {
    //           int index= s.charAt(i)-'a';
    //           chara[index]++;
    //        }
    //    }
    //    for(int i =0 ; i<26 ; i++){
    //       while(chara[i]>0){
    //          char character = (char) ('a' + i);
    //         sb.append(character);
    //       }
    //    }
    //    return sb.toString();
    

    // Lets's solve this question using BUKET theorem ...

  
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue()); // descending freq

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> e : list) {
            sb.append(String.valueOf(e.getKey()).repeat(e.getValue()));
        }
        return sb.toString();
    

    }
}