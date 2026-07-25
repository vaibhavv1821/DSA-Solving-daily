class Solution {

    public static char getMaxOccuringChar(String s) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int maxFreq = 0;
        char ans = 'a';

        // Traverse from 'a' to 'z'
        for (int i = 0; i < 26; i++) {

            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = (char) (i + 'a');
            }
        }

        return ans;
    }
}