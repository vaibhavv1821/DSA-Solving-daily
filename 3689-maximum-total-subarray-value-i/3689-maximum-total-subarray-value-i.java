class Solution {
    public long maxTotalValue(int[] nums, int k) {

        int globalMax = Integer.MIN_VALUE;
        int globalMin = Integer.MAX_VALUE;

        // Find overall maximum and minimum
        for (int num : nums) {
            globalMax = Math.max(globalMax, num);
            globalMin = Math.min(globalMin, num);
        }

        long bestSubarrayValue = (long) globalMax - globalMin;

        // Choose the same best subarray k times
        return bestSubarrayValue * k;
    }
}