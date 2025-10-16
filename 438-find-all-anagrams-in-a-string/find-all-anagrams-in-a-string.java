import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        int[] freqP = new int[26];
        int[] freqS = new int[26];
        for (char c : p.toCharArray()) {
            freqP[c - 'a']++;
        }

        int window = p.length();

        for (int i = 0; i < s.length(); i++) {
            freqS[s.charAt(i) - 'a']++;
            if (i >= window) {
                freqS[s.charAt(i - window) - 'a']--;
            }

            if (Arrays.equals(freqP, freqS)) {
                res.add(i - window + 1);
            }
        }

        return res;
    }
}
