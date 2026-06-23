class Solution {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        //inplace swaping to make transpose matrix
        for(int i = 0; i<N; i++){
            for(int j = i+1; j<N; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //now we have to swap the transpose matrix
        for(int row = 0; row<N; row++){
            //now we are in new row
            //now we have to swap first element with last element in each col.

            int Startcol = 0;
            int EndCol = N-1;

             while(Startcol <= EndCol){

            int temp = matrix[row][Startcol];
            matrix[row][Startcol] = matrix[row][EndCol];
            matrix[row][EndCol] = temp;

            Startcol++;
            EndCol--;
        }
        }
        
    }
}