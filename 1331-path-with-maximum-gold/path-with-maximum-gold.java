class Solution {
    int max = 0 ; 
    public int getMaximumGold(int[][] grid) {

        int n =grid.length;
        boolean[][] gold = new boolean[grid.length][grid[0].length]; 
        for(int i =0 ; i< n ; i++){
            for(int j=0 ; j< grid[0].length; j++){
                if(grid[i][j]!=0){
                    helper(grid, i , j ,0,gold );
                    
                }
            }
        }
        return max ;
    }
    public void helper(int[][] grid , int i , int j , int count,boolean gold[][] ){
        if(j>=grid[0].length || j<0 || i>=grid.length || i<0 || grid[i][j]==0 || gold[i][j]){
            max= Math.max(max, count);
            return;
        }
        gold[i][j]=true;
        helper(grid , i, j+1 ,count+grid[i][j],gold);
        helper(grid , i , j-1 , count+grid[i][j],gold);
        helper(grid , i+1 , j , count+grid[i][j],gold);
        helper(grid , i-1 , j , count+grid[i][j],gold);
        gold[i][j]=false;

    }
}