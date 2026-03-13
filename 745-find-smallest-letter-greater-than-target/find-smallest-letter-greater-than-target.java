class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start =0 ;
        int end = letters.length-1;
        int ans =-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(letters[mid] > target){
                ans =mid ;
                end = mid-1;
            }else {
                start =mid+1;
            }
        }
        if(ans == -1) return letters[0];

        return letters[ans];
    }
}