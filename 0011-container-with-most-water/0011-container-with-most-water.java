class Solution {
    public int maxArea(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        int max = 0;

        while (left < right) {
            int ht = Math.min(arr[left], arr[right]);
            int w = right - left;

            int curr = ht * w;

            max = Math.max(curr, max);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}