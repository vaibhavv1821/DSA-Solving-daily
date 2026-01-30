class Solution {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {

        int m = nums1.length;
        int n = nums2.length;

        int[] result = new int[k];

        // Try all valid splits
        for (int i = Math.max(0, k - n); i <= Math.min(k, m); i++) {

            int[] part1 = maxSubsequence(nums1, i);
            int[] part2 = maxSubsequence(nums2, k - i);

            int[] merged = merge(part1, part2);

            if (greater(merged, 0, result, 0)) {
                result = merged;
            }
        }

        return result;
    }

    // Get max subsequence of length k
    private int[] maxSubsequence(int[] nums, int k) {

        int n = nums.length;
        int[] stack = new int[k];
        int top = 0;
        int remain = n - k;

        for (int num : nums) {

            while (top > 0 && stack[top - 1] < num && remain > 0) {
                top--;
                remain--;
            }

            if (top < k) {
                stack[top++] = num;
            } else {
                remain--;
            }
        }

        return stack;
    }

    // Merge two arrays
    private int[] merge(int[] nums1, int[] nums2) {

        int i = 0, j = 0;
        int len = nums1.length + nums2.length;

        int[] res = new int[len];

        for (int k = 0; k < len; k++) {

            if (greater(nums1, i, nums2, j)) {
                res[k] = nums1[i++];
            } else {
                res[k] = nums2[j++];
            }
        }

        return res;
    }

    // Compare two arrays from given index
    private boolean greater(int[] nums1, int i, int[] nums2, int j) {

        while (i < nums1.length && j < nums2.length &&
               nums1[i] == nums2[j]) {
            i++;
            j++;
        }

        if (j == nums2.length) return true;
        if (i == nums1.length) return false;

        return nums1[i] > nums2[j];
    }
}
