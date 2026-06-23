class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
 
        int m = matrix.length;
        int n = matrix[0].length;

        //variable creations
        int s_row = 0;
        int e_row = m-1;

        int s_col = 0;
        int e_col = n-1;

        //lopping
        while(s_row <= e_row && s_col <= e_col ){
            //Row wise L -> R = Starting row print krna hai -> startingcol <= ending col tk chale ga
            for(int col = s_col; col<=e_col; col++){
                result.add(matrix[s_row][col]);
            }
            s_row++;

            //col wise T -> B = ending col print krna hai -> startingrow <= endingrow tk chala ga
            for(int row = s_row; row<=e_row; row++){
                result.add(matrix[row][e_col]);
            }
            e_col--;

            //row wise L -> R = endingrow print krna hai ->  ending col -> startingcol tk chala ga
            //validate bhe krna hai atleast ek row ho ga jo chala ga
            if(s_row <= e_row){
            for(int col = e_col; col>= s_col; col--){
                result.add(matrix[e_row][col]);
            }
            e_row--;
            }



            if(s_col <= e_col){
            for(int row = e_row; row>= s_row; row--){
                result.add(matrix[row][s_col]);
            }
            s_col++;
            }
           

        }
        return result;

    }
}