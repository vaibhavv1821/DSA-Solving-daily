class Solution {
    public int minimumCost(int[] nums) {

        int n = nums.length;

        // First subarray always starts at 0
        int first = nums[0];

        // Min value among nums[1..j-1]
        int minSecond = nums[1];

        int ans = Integer.MAX_VALUE;

        // j = start of third subarray
        for (int j = 2; j < n; j++) {

            // Try using current j
            ans = Math.min(ans, minSecond + nums[j]);

            // Update min for second subarray
            minSecond = Math.min(minSecond, nums[j]);
        }

        return first + ans;
    }
}
