class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // Check if ch1 is already mapped
            if (map.containsKey(ch1)) {

                // Existing mapping must match ch2
                if (map.get(ch1) != ch2) {
                    return false;
                }

            } else {

                // Check whether ch2 is already used
                if (map.containsValue(ch2)) {
                    return false;
                }

                // Store the mapping
                map.put(ch1, ch2);
            }
        }

        return true;
    }
}