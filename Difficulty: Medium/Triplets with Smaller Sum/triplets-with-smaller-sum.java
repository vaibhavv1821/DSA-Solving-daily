class Solution {
    int countTriplets(int sum, int[] arr) {

        Arrays.sort(arr);

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                if (arr[i] + arr[j] + arr[k] < sum) {

                    count += (k - j);
                    j++;

                } else {
                    k--;
                }
            }
        }

        return count;
    }
}