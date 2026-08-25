class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int i = 0;
        int j = 0;
        int required = s1.length();

        while (j < s2.length()) {

            char ch = s2.charAt(j);

            
            if (map.containsKey(ch)) {

                if (map.get(ch) > 0) {
                    required--;
                }

                map.put(ch, map.get(ch) - 1);
            }

         
            if (j - i + 1 == s1.length()) {

                if (required == 0) {
                    return true;
                }

            
                char left = s2.charAt(i);

                if (map.containsKey(left)) {

                    if (map.get(left) >= 0) {
                        required++;
                    }

                    map.put(left, map.get(left) + 1);
                }

                i++;
            }

            j++;
        }

        return false;
    }
}