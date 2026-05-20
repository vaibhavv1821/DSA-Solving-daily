import java.util.*;

class Solution {

    public String removeOuterParentheses(String s) {

        // Stack to track parentheses
        Stack<Character> stack = new Stack<>();

        // Stores final answer
        StringBuilder result = new StringBuilder();

        // Traverse every character
        for (char ch : s.toCharArray()) {

            // Opening bracket
            if (ch == '(') {

                // If stack is not empty,
                // then this is NOT outermost
                if (!stack.isEmpty()) {
                    result.append(ch);
                }

                // Push opening bracket
                stack.push(ch);
            }

            // Closing bracket
            else {

                // Remove matching opening bracket
                stack.pop();

                // If stack still not empty,
                // then this is NOT outermost
                if (!stack.isEmpty()) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}