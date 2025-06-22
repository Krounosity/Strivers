class Rotate_Matrix_90 {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;

        // Flip along horizontal axis
        for(int i=0; i<n/2; i++){
            int[] tempRow = matrix[i];
            matrix[i] = matrix[n - i - 1];
            matrix[n - i - 1] = tempRow;
        }

        // Transpose
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
}