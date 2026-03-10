class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int k = p.length();
        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);
        String pSorted = new String(pArr);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){

            sb.append(s.charAt(i));

            if(sb.length() > k){
               sb.deleteCharAt(0);
            }

            if(sb.length() == k){
                char[] arr = sb.toString().toCharArray();
                Arrays.sort(arr);
                String temp = new String(arr);

                if(temp.equals(pSorted)){
                    ans.add(i - k + 1);
                }
            }
        }

        return ans;
    }
}