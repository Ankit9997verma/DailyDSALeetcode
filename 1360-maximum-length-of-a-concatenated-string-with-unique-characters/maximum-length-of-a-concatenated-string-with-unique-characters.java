class Solution {
    static boolean hasDuplicate(String temp, String s1) {
    int[] arr = new int[26];
    for (int i = 0; i < temp.length(); i++) {
        arr[temp.charAt(i) - 'a']++;
    }
    for (int i = 0; i < s1.length(); i++) {
        arr[s1.charAt(i) - 'a']++;

        if (arr[s1.charAt(i) - 'a'] > 1) {
            return true;
        }
    }

    return false;
}
    static int solve(int i , List<String> arr , String temp , int n){
        if(i >= n) return temp.length();

        int include =0 ;
        int exclude =0 ; 
        if(hasDuplicate(temp ,arr.get(i) )){
            exclude = solve(i+1 , arr , temp , n);
        }else{
            exclude = solve(i+1 , arr , temp , n);
            include = solve(i+1 , arr , temp+arr.get(i), n);
        }
        return Math.max(include , exclude);
    }
    public int maxLength(List<String> arr) {
        String temp ="";
        int n = arr.size();
        int i =0 ;
        return solve(i , arr , temp , n);
    }
}