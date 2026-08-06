class Solution {
    public void solveSudoku(char[][] board) {
        solvesudokohelper(board);
    }

    static boolean findemptycell(char[][] board, int[] emptycell) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    //store the col and row index
                    emptycell[0] = i;
                    emptycell[1] = j;
                    return true;
                }
            }
        }
        return false;
    }

    static boolean issafe(char[][] board, char charvalue, int rowindex, int colindex) {
        //3rules hai 
        //1 check row wise
        for (int col = 0; col < 9; col++) {
            if (board[rowindex][col] == charvalue) {
                return false;
            }
        }

        //2 check col wise
        for (int row = 0; row < 9; row++) {
            if (board[row][colindex] == charvalue) {
                return false;
            }
        }

        //3*# box check
        int startrow = rowindex - rowindex % 3;
        int startcol = colindex - colindex % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int actualrow = startrow + i;
                int actualcol = startcol + j;

                if (board[actualrow][actualcol] == charvalue) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solvesudokohelper(char[][] board) {
        int[] emptycell = new int[2];
        //base case
        if (!findemptycell(board, emptycell)) {
            return true;
        }

        //ek empty cell m,il gya

        int rowindex = emptycell[0];
        int colindex = emptycell[1];

        for (int value = 1; value <= 9; value++) {
            char charvalue = (char) (value + '0');

            if (issafe(board, charvalue, rowindex, colindex)) {
                //place kro
                board[rowindex][colindex] = charvalue;

                //backtracking
                if (solvesudokohelper(board) == true) {
                    return true;
                }

                board[rowindex][colindex] = '.';

            }

        }
        return false;
    }
}