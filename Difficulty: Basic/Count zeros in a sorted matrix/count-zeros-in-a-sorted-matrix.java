class Solution {
    public int countZeros(int[][] mat) {
        // code here
        int row = mat.length;
        int col = mat[0].length;
        int count = 0;
        
        for(int i=0 ; i< row ; i++){
            for(int j=0 ; j<col ; j++){
                if(mat[i][j] == 0){
                    count++;
                }
            }
        }
        return count;
    }
}