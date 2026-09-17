class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int row = mat.length;
        int col = mat[0].length;
        int [][] prefix = new int[row][col];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                prefix[i][j] = mat[i][j];
                if(i > 0){
                    prefix[i][j] += prefix[i-1][j];
                }
                if(j > 0){
                    prefix[i][j] += prefix[i][j-1];
                }
                if(i > 0 && j > 0){
                    prefix[i][j] -= prefix[i-1][j-1];
                }
            }
        }

        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                int rows = Math.max(0,i-k);
                int rowe = Math.min(row-1,i+k);

                int cols = Math.max(0,j-k);
                int cole = Math.min(col - 1,j+k);

                mat[i][j] = prefix[rowe][cole];
                if(rows > 0){
                    mat[i][j] -= prefix[rows - 1][cole];
                }
                if(cols > 0){
                    mat[i][j] -= prefix[rowe][cols-1];
                }
                if(rows > 0 && cols > 0){
                    mat[i][j] += prefix[rows-1][cols-1];
                }
            }
        }
        return mat;
    }
}