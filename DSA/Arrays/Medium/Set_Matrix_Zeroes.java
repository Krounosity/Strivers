class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean rowI[] = new boolean[rows];
        boolean colI[] = new boolean[cols];

        for(int i=0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(matrix[i][j] == 0){
                    rowI[i] = true;
                    colI[j] = true;
                }
            }
        }

        for(int i=0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(rowI[i] || colI[j]) matrix[i][j] = 0;
            }
        }

    }
}

// O(1) space solution

/*class Solution {
    public void setZeroes(int[][] matrix) {
        boolean zeroinFirstCol = false;
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][0] == 0) zeroinFirstCol = true;
            for (int col = 1; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        for (int row = matrix.length - 1; row >= 0; row--) {
            for (int col = matrix[0].length - 1; col >= 1; col--) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
            if (zeroinFirstCol) {
                matrix[row][0] = 0;
            }
        }
    }
} */