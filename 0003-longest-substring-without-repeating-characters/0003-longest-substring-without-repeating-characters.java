import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int a = 0;
        int max = 0;

        for (int b = 0; b < s.length(); b++) {

            while (set.contains(s.charAt(b))) {
                set.remove(s.charAt(a));
                a++;
            }

            set.add(s.charAt(b));

            max = Math.max(max, b - a + 1);
        }

        return max;
    }
}
