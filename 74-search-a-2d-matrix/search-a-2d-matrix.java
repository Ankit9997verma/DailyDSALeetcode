class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length ; // 3
        int  n= matrix[0].length ; //4

        int start =0 ; 
        int end = m*n -1 ;
       
        while(start <= end){
            int mid = start + (end - start) /2 ; 
            int row = mid /n ; 
            int col = mid%n ;

            if(matrix[row][col] == target) return true ;
            else if(matrix[row][col] < target) start = mid +1 ; 
            else 
            end = mid -1 ;
        }
        return false ;
    }
}