import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                stack.pop(); // remove last score
            } 
            else if (op.equals("D")) {
                stack.push(2 * stack.peek()); // double last score
            } 
            else if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);       // push back previous
                stack.push(newTop);    // push sum
            } 
            else {
                stack.push(Integer.parseInt(op)); // normal number
            }
        }

        // sum all values
        int sum = 0;
        for (int num : stack) {
            sum += num;
        }

        return sum;
    }
}