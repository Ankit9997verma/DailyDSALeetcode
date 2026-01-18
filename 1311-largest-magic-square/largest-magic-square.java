class Solution {

    private int rowSum(int[][] row, int r, int c1, int c2) {
        return row[r][c2 + 1] - row[r][c1];
    }

    private int colSum(int[][] col, int c, int r1, int r2) {
        return col[r2 + 1][c] - col[r1][c];
    }

    private boolean helper(int[][] grid, int[][] row, int[][] col, int r, int c, int size) {

        int target = rowSum(row, r, c, c + size - 1);

        
        for (int i = r; i < r + size; i++) {
            if (rowSum(row, i, c, c + size - 1) != target) return false;
        }

        for (int j = c; j < c + size; j++) {
            if (colSum(col, j, r, r + size - 1) != target) return false;
        }
        int diag1 = 0;
        for (int t = 0; t < size; t++) {
            diag1 += grid[r + t][c + t];
        }
        if (diag1 != target) return false;
        int diag2 = 0;
        for (int t = 0; t < size; t++) {
            diag2 += grid[r + t][c + (size - 1 - t)];
        }
        if (diag2 != target) return false;

        return true;
    }

    public int largestMagicSquare(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] row = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                row[i][j + 1] = row[i][j] + grid[i][j];
            }
        }

        int[][] col = new int[n + 1][m];
        for (int c = 0; c < m; c++) {
            for (int r = 0; r < n; r++) {
                col[r + 1][c] = col[r][c] + grid[r][c];
            }
        }

        int maxSize = Math.min(n, m);

        for (int size = maxSize; size >= 2; size--) {
            for (int r = 0; r + size <= n; r++) {
                for (int c = 0; c + size <= m; c++) {
                    if (helper(grid, row, col, r, c, size)) {
                        return size;
                    }
                }
            }
        }

        return 1;
    }
}



// class Solution {
//     private boolean helper (int[] grid , int[][] row , int[][] col, int r, int c, int size ){
//         int target =  rowSum(row, r, c, c + size - 1);
//     }
//     public int largestMagicSquare(int[][] grid) {
//         int n = grid.length ; 
//         int m = grid[0].length ; 

//         int[][] row = new int [n][m+1];
//             for (int i = 0; i < n; i++) {
//                  for (int j = 0; j < m; j++) {
//                    row[i][j + 1] = row[i][j] + grid[i][j];
//              }
//          }

//          int [][] col = new int [n+1][m];
//          for(int i =0 ; i< m ; i++){
//             for(int j =0 ; j< n ; j++){
//                 row[i+1][j]= row[i][j] + grid[i][j]; 
//             }
//          }
//          int maxSize = Math.min(m , n );
//          for(int size = mazSize ; size>=2 ; size--){
//             for(int r = 0 ; r+size < n ; r++){
//                 for(int c=0 ; c+size< m ; c++){
//                     if(helper(grid , row , col , r ,c , size)){
//                         return size;
//                     }

//                 }
//             }
//          }
//          return 1 ;
//     }
// }