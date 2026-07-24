class Solution {

    public String removeDuplicates(String s, int k) {

        StringBuilder stack = new StringBuilder();
        int[] count = new int[s.length()];

        for (char ch : s.toCharArray()) {

            stack.append(ch);

            int last = stack.length() - 1;

            if (last > 0 && stack.charAt(last) == stack.charAt(last - 1)) {
                count[last] = count[last - 1] + 1;
            } else {
                count[last] = 1;
            }

            if (count[last] == k) {
                stack.delete(stack.length() - k, stack.length());
            }
        }

        return stack.toString();
    }
}