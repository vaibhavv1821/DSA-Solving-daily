import java.util.*;

class Solution {
    public int maxDistance(int side, int[][] points, int k) {
        int n = points.length;
        long[] pos = new long[n];
        long totalLen = 4L * side;

        // 1. Map to 1D and Sort
        for (int i = 0; i < n; i++) {
            int x = points[i][0], y = points[i][1];
            if (y == 0) pos[i] = x;
            else if (x == side) pos[i] = side + y;
            else if (y == side) pos[i] = 2L * side + (side - x);
            else pos[i] = 3L * side + (side - y);
        }
        Arrays.sort(pos);

        // 2. Binary Search on Answer
        int low = 0, high = side, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(pos, k, mid, totalLen)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean check(long[] pos, int k, int d, long totalLen) {
        int n = pos.length;
        // Create a doubled array to handle circular wrap-around easily
        long[] circle = new long[2 * n];
        for (int i = 0; i < n; i++) {
            circle[i] = pos[i];
            circle[i + n] = pos[i] + totalLen;
        }

        // We only need to test starting points in the first 'gap' 
        // to ensure we cover all possible optimal cycles.
        for (int i = 0; i < n; i++) {
            // Optimization: If the first point we pick is already 
            // further than d from the start, we've covered the necessary range.
            if (pos[i] - pos[0] > d) break;

            int count = 1;
            int curr = i;
            long startPos = circle[i];
            
            // Greedy jump
            for (int j = 1; j < k; j++) {
                int next = findNext(circle, curr, n, d);
                if (next >= i + n) {
                    count = -1;
                    break;
                }
                curr = next;
                count++;
            }

            if (count == k && (startPos + totalLen - circle[curr]) >= d) {
                return true;
            }
        }
        return false;
    }

    private int findNext(long[] circle, int curr, int n, int d) {
        int left = curr + 1, right = curr + n - 1;
        int res = 2 * n;
        long target = circle[curr] + d;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (circle[mid] >= target) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
}