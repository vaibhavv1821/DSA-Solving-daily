class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int i = 0;
        int j = n - 1;
        int k= n-1;

        while (i <= j) {
            int sq1 = arr[i]*arr[i];
            int sq2 = arr[j]*arr[j];

            if (sq1>sq2) {
                res[k] = sq1;
                i++;
            } else {
                res[k] = sq2;
                
                j--;
            }
            k--;
        }
        return res;
    }
}