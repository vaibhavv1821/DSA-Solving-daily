class Solution {

    public String reversePrefix(String word, char ch) {

        int index = -1;

        // find first occurrence
        for(int i = 0; i < word.length(); i++) {

            if(word.charAt(i) == ch) {
                index = i;
                break;
            }
        }

        // if character not found
        if(index == -1) {
            return word;
        }

        char[] arr = word.toCharArray();

        int left = 0;
        int right = index;

        // reverse
        while(left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}