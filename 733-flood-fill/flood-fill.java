class Solution {
    public void helper(int[][] image , int i , int j , int oldColor , int newColor ){
        if(i< 0 || j<0 || i >= image.length || j >= image[0].length ){
            return ;
        }
        if(image[i][j] != oldColor) return ; 

        image[i][j]=newColor;

        helper(image , i+1 , j , oldColor , newColor);
        helper(image , i-1 , j , oldColor , newColor);
        helper(image , i , j+1 , oldColor , newColor);
        helper(image , i , j-1 , oldColor , newColor);



    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length ;
        int m = image[0].length ;
       
       int oldColor = image[sr][sc];

        if (oldColor == color) return image;

       helper(image , sr , sc , oldColor , color);
       return image ;
    }
}