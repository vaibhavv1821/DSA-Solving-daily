class Solution {
    public int mySqrt(int x) {
        int right =x;
        int left = 1;
        int res =0;
        if (x == 0 || x == 1) return x;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
           
        }
        return right;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna