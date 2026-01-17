class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == 0) {
                int left ,right;

                if(i == 0) {
                    left =0;
                } else {
                    left = arr[i-1];
                }
                if (i == arr.length-1) {
                    right =0;
                } else {
                   right = arr[i+1];
                }

                if(left == 0 && right == 0) {
                    arr[i] = 1;
                    n--;

                    if(n == 0) return true;
                }
            }
        }
        return n <= 0;
    }
}
