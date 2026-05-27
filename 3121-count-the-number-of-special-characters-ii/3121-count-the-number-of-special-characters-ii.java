class Solution {

    public int numberOfSpecialChars(String word) {

        int[] lowerLast = new int[26];
        int[] upperFirst = new int[26];

        // initialize
        for (int i = 0; i < 26; i++) {
            lowerLast[i] = -1;
            upperFirst[i] = -1;
        }

        // store positions
        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {

                lowerLast[ch - 'a'] = i;

            } else {

                int idx = ch - 'A';

                // store first uppercase occurrence
                if (upperFirst[idx] == -1) {
                    upperFirst[idx] = i;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {

            if (lowerLast[i] != -1 &&
                upperFirst[i] != -1 &&
                lowerLast[i] < upperFirst[i]) {

                count++;
            }
        }

        return count;
    }
}