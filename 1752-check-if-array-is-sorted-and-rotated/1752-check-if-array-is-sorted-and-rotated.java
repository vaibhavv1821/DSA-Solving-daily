class Solution {
    public boolean check(int[] nums) {

        int drops = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            // check if order breaks
            if (nums[i] > nums[i + 1]) {
                drops++;
            }
        }

        // check last and first separately
        if (nums[nums.length - 1] > nums[0]) {
            drops++;
        }

        return drops <= 1;
    }
}