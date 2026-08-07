class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int row = mat.length;
        int col = mat[0].length;

        if (row * col != r * c) {
            return mat;
        }

        int[][] ans = new int[r][c];

        int newRow = 0;
        int newCol = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                ans[newRow][newCol] = mat[i][j];

                newCol++;

                if (newCol == c) {
                    newCol = 0;
                    newRow++;
                }
            }
        }

        return ans;
    }
}