import java.util.*;

class Solution {
    public int oddEvenJumps(int[] arr) {
        int n = arr.length;

        int[] nextHigher = new int[n];
        int[] nextLower = new int[n];

        Arrays.fill(nextHigher, -1);
        Arrays.fill(nextLower, -1);

        // Indices
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;

        // ---------- Next Higher (Odd Jump) ----------
        Arrays.sort(idx, (a, b) -> {
            if (arr[a] != arr[b])
                return arr[a] - arr[b];
            return a - b;
        });

        Stack<Integer> stack = new Stack<>();

        for (int i : idx) {
            while (!stack.isEmpty() && i > stack.peek()) {
                nextHigher[stack.pop()] = i;
            }
            stack.push(i);
        }

        // ---------- Next Lower (Even Jump) ----------
        Arrays.sort(idx, (a, b) -> {
            if (arr[a] != arr[b])
                return arr[b] - arr[a];
            return a - b;
        });

        stack.clear();

        for (int i : idx) {
            while (!stack.isEmpty() && i > stack.peek()) {
                nextLower[stack.pop()] = i;
            }
            stack.push(i);
        }

        // ---------- DP ----------
        boolean[] odd = new boolean[n];
        boolean[] even = new boolean[n];

        odd[n - 1] = true;
        even[n - 1] = true;

        for (int i = n - 2; i >= 0; i--) {
            if (nextHigher[i] != -1)
                odd[i] = even[nextHigher[i]];

            if (nextLower[i] != -1)
                even[i] = odd[nextLower[i]];
        }

        // ---------- Count ----------
        int count = 0;
        for (boolean b : odd) {
            if (b) count++;
        }

        return count;
    }
}
