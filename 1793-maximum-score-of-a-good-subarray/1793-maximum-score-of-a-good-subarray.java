class Solution {
    public int maximumScore(int[] nums, int k) {

        int n = nums.length;

        int left = k;
        int right = k;

        int minVal = nums[k];
        int ans = minVal;

        while (left > 0 || right < n - 1) {

            // Decide which side to expand
            if (left == 0) {
                right++;
            } 
            else if (right == n - 1) {
                left--;
            } 
            else if (nums[left - 1] >= nums[right + 1]) {
                left--;
            } 
            else {
                right++;
            }

            // Update minimum
            minVal = Math.min(minVal,
                    Math.min(nums[left], nums[right]));

            // Update answer
            int len = right - left + 1;
            ans = Math.max(ans, minVal * len);
        }

        return ans;
    }
}
