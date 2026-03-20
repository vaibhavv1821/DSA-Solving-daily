import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        t = t.toLowerCase().replaceAll("[^a-z0-9]", "");

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char d : t.toCharArray())
            map.put(d, map.getOrDefault(d, 0) - 1);

        for (int count : map.values())
            if (count != 0) return false;

        return true;
    }
}