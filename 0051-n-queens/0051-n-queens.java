class Solution {
    public List<List<String>> solveNQueens(int n) {
        //creating board
        char[][] board = new char[n][n];
        int colIndex = 0;
        //frilling the . in all the part of the board
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        List<List<String>> ans = new ArrayList<>();
        solve(board, n, colIndex, ans);
        return ans;

    }

    public static void solve(char[][] board,int n,int colIndex, List<List<String>> ans){
        //Base case
        if(colIndex >= n){
            //iiska mtlb valid ans mil gya hai store kro ans ko
            List<String> temp = new ArrayList<>();
            for(int i = 0; i< n; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }

        //recursive call
        for(int rowIndex = 0; rowIndex < n; rowIndex++){
            if(isSafePlace(rowIndex,colIndex,n,board)){
                //place queen
                board[rowIndex][colIndex] = 'Q';
                //BAKKI RECURSION
                solve(board,n,colIndex+1,ans);
                //backtracking
                board[rowIndex][colIndex] = '.';
            }
        }

    }

    public static boolean isSafePlace(int rowIndex, int colIndex,int n , char[][] board){

        // we check for left horiziontal <--
        int row = rowIndex;
        int col = colIndex;

        while(col >= 0){
            if(board[row][col]=='Q'){
                return false;
            }
            col--;
        }
        //checking upper digonal

        row = rowIndex;
        col = colIndex;

        while(row >= 0 && col >=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row = row-1;
            col = col-1;
        }

        //checking lower digonal

        row = rowIndex;
        col = colIndex;

        while(row < n && col >=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row = row +1;
            col = col-1;
        }
        return true;
    }
}