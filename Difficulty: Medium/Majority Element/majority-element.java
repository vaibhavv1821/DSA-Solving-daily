class Solution {
    static int majorityElement(int[] arr) {

        int candidate = 0;
        int count = 0;

        // Step 1: Find candidate
        for (int i = 0; i < arr.length; i++) {

            if (count == 0) {
                candidate = arr[i];
            }

            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        }

        return -1;
    }
}