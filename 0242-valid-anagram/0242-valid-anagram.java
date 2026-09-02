import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        t = t.toLowerCase().replaceAll("[^a-z0-9]", "");

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (char c : s.toCharArray())
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);

        for (char d : t.toCharArray())
            mapT.put(d, mapT.getOrDefault(d, 0) + 1);

        return mapS.equals(mapT);
    }
}
