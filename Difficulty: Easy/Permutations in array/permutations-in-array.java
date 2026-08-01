import java.util.Arrays;

class Solution {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        Arrays.sort(arr1); // ascending
        Arrays.sort(arr2); // ascending
        int n = arr1.length;
        
        // Compare smallest of arr1 with largest of arr2
        for (int i = 0; i < n; i++) {
            if (arr1[i] + arr2[n - 1 - i] < k) {
                return false;
            }
        }
        return true;
    }
}
