import java.util.*;

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        int n = arr.size();
        
        // Edge case: not enough packets
        if (m > n) return -1;
        
        // Edge case: only one student
        if (m == 1) return 0;
        
        // Step 1: Sort the ArrayList
        Collections.sort(arr);
        
        int minDiff = Integer.MAX_VALUE;
        
        // Step 2: Sliding window
        for (int i = 0; i <= n - m; i++) {
            int diff = arr.get(i + m - 1) - arr.get(i);
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
    }
}