class Solution {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans =1 ; 
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                ans++;
                set.clear();
            }
            set.add(ch);
        }
        return ans ; 
    }
}