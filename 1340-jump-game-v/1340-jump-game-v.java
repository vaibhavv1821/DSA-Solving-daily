class Solution {

    int[] dp;

    public int maxJumps(int[] arr, int d) {

        int n = arr.length;

        dp = new int[n];

        int ans = 1;

        for(int i = 0; i < n; i++) {

            ans = Math.max(ans, dfs(arr, d, i));
        }

        return ans;
    }

    public int dfs(int[] arr, int d, int i) {

        // already calculated
        if(dp[i] != 0) {
            return dp[i];
        }

        int best = 1;

        // check right side
        for(int j = i + 1; j <= Math.min(i + d, arr.length - 1); j++) {

            // blocked
            if(arr[j] >= arr[i]) {
                break;
            }

            best = Math.max(best, 1 + dfs(arr, d, j));
        }

        // check left side
        for(int j = i - 1; j >= Math.max(i - d, 0); j--) {

            // blocked
            if(arr[j] >= arr[i]) {
                break;
            }

            best = Math.max(best, 1 + dfs(arr, d, j));
        }

        dp[i] = best;

        return best;
    }
}