class Solution {
    public int maxProfit(int[] arr) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int profit =0;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);

            profit = arr[i] - min;

            max = Math.max(max, profit);

        }

        return max;
    }
}