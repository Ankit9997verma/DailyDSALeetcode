class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length ; 
        int m = grid[0].length ;

        int[] dx = {-1 ,0 , 1 , 0};
        int[] dy= {0, 1 , 0 ,-1 };
        Queue<int[]> queue = new LinkedList<>();

        for(int i =0 ; i< n ; i++){
            for(int j =0 ; j< m ; j++){
                if(grid[i][j]== 2){
                    queue.add(new int[]{i,j});
                }
            }
        }
        int ans =0 ; 
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean rotted =false ;
            for(int s=0 ; s< size ; s++){
                int[] curr = queue.poll();
                int i = curr[0];
                int j = curr[1];

                for(int k=0 ; k< 4 ; k++){
                    int ni = i+ dx[k];
                    int nj = j + dy[k];

                    if(ni>=0 && nj >=0 && ni< n && nj <m && grid[ni][nj]==1){
                        grid[ni][nj]=2;
                        queue.offer(new int[]{ni , nj });
                        rotted=true ;
                    }
                }
            }
            if(rotted) ans++;
        }
        for(int i=0 ; i< n ; i++){
            for(int j =0 ; j< m ; j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return ans ; 
    }
}