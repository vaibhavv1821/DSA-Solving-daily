class Solution {

    public int removeDuplicates(int[] arr) {

       int r = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[r] != arr[i]) {
                r++;
                arr[r] = arr[i];
               
            }
        }
        return r+1;
    }
}
