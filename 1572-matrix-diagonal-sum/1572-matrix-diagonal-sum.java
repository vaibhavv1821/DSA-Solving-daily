class Solution {
    public int diagonalSum(int[][] mat) {
        int rows = mat.length;
        int col = mat[0].length;
        int sum =0;
        int sum1 = 0; int sum2 =0;

        for(int i =0; i<rows;i++){
            for(int j=0; j<col; j++){
                if (i == j){
                     sum1+= mat[i][j];
                }
                else if (i+j == rows-1){
                     sum2+= mat[i][j];
                }
                sum = sum1 +sum2;
            }
        }
        return sum ;
    }
}