import java.util.HashMap;

class Solution {

    public boolean isAnagram(String s, String t) {

        // Step 1: Length check
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create frequency map
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 3: Count characters in s
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 4: Reduce count using t
        for (char ch : t.toCharArray()) {

            // If character not present → not anagram
            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            // Remove if count becomes 0
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        // Step 5: If map empty → anagram
        return map.isEmpty();
    }
}
