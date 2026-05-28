import java.util.*;

class Solution {

    public ArrayList<Integer> nextLargerElement(int[] arr) {

        int n = arr.length;

        Stack<Integer> stack = new Stack<>();

        ArrayList<Integer> res = new ArrayList<>();

        // initialize with -1
        for (int i = 0; i < n; i++) {
            res.add(-1);
        }

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                res.set(i, stack.peek());
            }

            stack.push(arr[i]);
        }

        return res;
    }
}