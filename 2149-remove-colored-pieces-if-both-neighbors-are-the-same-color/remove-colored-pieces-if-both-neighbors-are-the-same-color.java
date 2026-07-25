class Solution {
    public boolean winnerOfGame(String colors) {
        int countA=0 ; 
        int countB =0 ; 
        for (int i = 0; i <= colors.length() - 3; i++) {
    if (colors.charAt(i) == colors.charAt(i + 1) &&
        colors.charAt(i + 1) == colors.charAt(i + 2)) {

        if (colors.charAt(i) == 'A')
            countA++;
        else
            countB++;
    }
}
        if(countA> countB) return true ;
        return false ;
    }
}