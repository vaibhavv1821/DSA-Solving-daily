import java.util.Stack;

class Solution {

    public int[] dailyTemperatures(int[] arr) {

        int n = arr.length;

        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Current temperature is warmer
            // than temperatures in stack
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {

                int prevIndex = stack.pop();

                ans[prevIndex] = i - prevIndex;
            }

            // Store current index
            stack.push(i);
        }

        return ans;
    }
}