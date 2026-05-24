import java.util.*;

class Solution {

    public String reversePrefix(String word, char ch) {

        Stack<Character> stack = new Stack<>();

        int index = -1;

        // Find first occurrence and push into stack
        for(int i = 0; i < word.length(); i++) {

            stack.push(word.charAt(i));

            if(word.charAt(i) == ch) {
                index = i;
                break;
            }
        }

        // If character not found
        if(index == -1) {
            return word;
        }

        StringBuilder ans = new StringBuilder();

        // Pop from stack -> reversed prefix
        while(!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        // Add remaining characters
        for(int i = index + 1; i < word.length(); i++) {
            ans.append(word.charAt(i));
        }

        return ans.toString();
    }
}