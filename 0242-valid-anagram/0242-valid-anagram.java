class Solution {

    public boolean isAnagram(String s, String t) {

        // If lengths are different, cannot be anagram
        if (s.length() != t.length()) {
            return false;
        }

        // Convert t to StringBuilder so we can delete characters
        StringBuilder sb = new StringBuilder(t);

        // Go through each character of s
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            boolean found = false;

            // Search this character in sb
            for (int j = 0; j < sb.length(); j++) {

                if (sb.charAt(j) == ch) {

                    // If found, remove it
                    sb.deleteCharAt(j);
                    found = true;
                    break;
                }
            }

            // If character not found in t
            if (!found) {
                return false;
            }
        }

        // If all characters matched
        return sb.length() == 0;
    }
}
