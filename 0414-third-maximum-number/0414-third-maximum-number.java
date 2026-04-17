import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int distinctCount = 0;
        Integer prev = null;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (prev == null || nums[i] != prev) {
                distinctCount++;
                prev = nums[i];
            }

            if (distinctCount == 3) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}