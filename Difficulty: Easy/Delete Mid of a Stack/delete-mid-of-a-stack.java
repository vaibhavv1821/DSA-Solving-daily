import java.util.*;

class Solution {

    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {

        int mid = s.size() / 2;

        Stack<Integer> stack = new Stack<>();

        // move top elements
        for (int i = 0; i < mid; i++) {
            stack.push(s.pop());
        }

        // delete middle
        s.pop();

        // put back elements
        while (!stack.isEmpty()) {
            s.push(stack.pop());
        }
    }
}