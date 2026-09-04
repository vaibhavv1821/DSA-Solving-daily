class Solution {
    public long maximumSubarraySum(int[] arr, int k) {

        HashSet<Integer> set = new HashSet<>();

        long sum = 0;
        long max = 0;

        int i = 0;
        int j = 0;

        while (j < arr.length) {

            while (set.contains(arr[j])) {
                set.remove(arr[i]);
                sum = sum - arr[i];
                i++;
            }

            set.add(arr[j]);
            sum = sum + arr[j];

            if (j - i + 1 == k) {
                max = Math.max(max, sum);

                set.remove(arr[i]);
                sum = sum - arr[i];
                i++;
            }

            j++;
        }

        return max;
    }
}