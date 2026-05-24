import java.util.Stack;

class Solution {
    public int maxDepth(String s) {

        int maxDepth = 0;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                stack.push(c);
                maxDepth = Math.max(maxDepth, stack.size());
            }

            else if (c == ')') {
                stack.pop();
            }
        }
        return maxDepth;
    }
}