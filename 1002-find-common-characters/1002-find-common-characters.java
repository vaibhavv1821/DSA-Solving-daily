import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {

        HashMap<Character,Integer> map = new HashMap<>();

        // first word frequency
        for(char c : words[0].toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        // compare with remaining words
        for(int i=1; i<words.length; i++){

            HashMap<Character,Integer> temp = new HashMap<>();

            for(char c : words[i].toCharArray()){
                temp.put(c, temp.getOrDefault(c,0)+1);
            }

            // keep minimum frequency
            for(char ch : new HashSet<>(map.keySet())){
                if(temp.containsKey(ch)){
                    map.put(ch, Math.min(map.get(ch), temp.get(ch)));
                } else{
                    map.remove(ch);
                }
            }
        }

        List<String> ans = new ArrayList<>();

        for(char ch : map.keySet()){
            int count = map.get(ch);
            while(count-- > 0){
                ans.add(String.valueOf(ch));
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna