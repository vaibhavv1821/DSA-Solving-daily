import java.util.*;

class Solution {

    public String smallestPalindrome(String s, int k) {

        int[] freq = new int[26];

        // Count frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Find middle character
        char mid = 0;

        for (int i = 0; i < 26; i++) {

            if (freq[i] % 2 == 1) {
                mid = (char) (i + 'a');
            }

            freq[i] /= 2;
        }

        // Length of left part
        int len = 0;
        for (int f : freq) len += f;

        // Check total permutations
        if (countPerm(freq, len, k) < k) {
            return "";
        }

        StringBuilder left = new StringBuilder();

        // Build left half
        for (int pos = 0; pos < len; pos++) {

            for (int i = 0; i < 26; i++) {

                if (freq[i] == 0) continue;

                freq[i]--;

                long cnt = countPerm(freq, len - pos - 1, k);

                if (cnt >= k) {

                    left.append((char) (i + 'a'));
                    break;

                } else {

                    k -= cnt;
                    freq[i]++;
                }
            }
        }

        // Build right half
        StringBuilder right = new StringBuilder(left).reverse();

        if (mid != 0) {
            return left + "" + mid + right;
        }

        return left + right.toString();
    }

    // Count permutations safely (with cap)
    private long countPerm(int[] freq, int len, int k) {

        long res = 1;

        int total = 0;

        for (int f : freq) {

            for (int i = 1; i <= f; i++) {

                total++;
                res = res * total / i;

                if (res > k) {
                    return k + 1; // cap
                }
            }
        }

        return res;
    }
}
