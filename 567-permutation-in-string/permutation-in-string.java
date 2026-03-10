class Solution {
    public boolean checkInclusion(String s, String s2) {
        if(s2.length()< s.length()) return false ;
       int [] freq = new int[128];
       int[] freq1= new int[128];
       for(char ch : s.toCharArray()){
        freq[ch]++;
       }
       
       
       int m = s.length();
       int n = s2.length();
      
       for(int i =0 ; i< m ; i++){
          freq1[s2.charAt(i)]++;
          
       }
       if(Arrays.equals(freq1,freq)) return true;
       for(int i =m ; i<n ; i++){
         freq1[s2.charAt(i)]++;
         freq1[s2.charAt(i-m)]--;
         if(Arrays.equals(freq1, freq)) return true ;
       }
       return false ;
    }
}