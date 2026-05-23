class Solution {

    public String clearDigits(String s) {

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // if character is digit
            if(Character.isDigit(ch)) {

                st.pop();

            } else {

                // store letter
                st.push(ch);
            }
        }

        String ans = "";

        while(!st.isEmpty()) {

            ans = st.pop() + ans;
        }

        return ans;
    }
}