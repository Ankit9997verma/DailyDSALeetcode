class Solution {
    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> res=new ArrayList<>();
        dfs(0,board,res,new ArrayList<String>());
        return res;
    }

    static void dfs(int col,char board[][],List<List<String>> res,List<String> ans){
        if(col==board.length){
            List<String> temp=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String str="";
                for(int j=0;j<board[0].length;j++){
                    str+=board[i][j];
                }
                temp.add(str);
            }
            if(!res.contains(temp)){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int row=0;row<board.length;row++){
            if(helper(row,col,board)){
                board[row][col]='Q';
                dfs(col+1,board,res,ans);
                board[row][col]='.';
            }
        }
    }
    static boolean helper(int row,int col,char board[][]){
        int drow=row;
        int dcol=col;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q') return false;
            row--;col--;
        }
        row=drow;
        col=dcol;
        while(col>=0){
            if(board[row][col]=='Q') return false;
            col--;
        }
        row=drow;
        col=dcol;
        while(col>=0 && row<board.length){
            if(board[row][col]=='Q') return false;
            row++;
            col--;
        }
        return true;
    }
}