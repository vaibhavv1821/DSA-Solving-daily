class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (sb.length() >= 2 &&
                sb.charAt(sb.length() - 1) == ch &&
                sb.charAt(sb.length() - 2) == ch) {
                continue;
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}