class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int array1[]=new int[n];
        int array2[]=new int[n];


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                array1[i]=Math.max(array1[i],grid[i][j]);
                array2[j]=Math.max(array2[j],grid[i][j]);


            }
        }
        int ans=0;
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            int diff=Math.min(array1[i],array2[j]);
            ans+=diff-grid[i][j];
            }
         }
         return ans;
        
        
    }
}