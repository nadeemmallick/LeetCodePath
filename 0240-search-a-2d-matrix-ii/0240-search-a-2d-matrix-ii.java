class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //BRUTE FORCE
        // int n = matrix.length;
        // int m = matrix[0].length;

        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<m; j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //OPTIMAL

       int totalrow = matrix.length;
       int totalcol = matrix[0].length;

       int row = 0;
       int col = totalcol-1;

      while(row < totalrow && col >= 0){
        if(matrix[row][col]==target){
            return true;
        }else if(matrix[row][col] > target){
            col--;
        }else{
            // row,col < target
            row++;
        }
      }
      return false;
    }
}