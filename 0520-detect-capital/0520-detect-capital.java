class Solution {
    public boolean detectCapitalUse(String word) {
         if(word.equals(word.toUpperCase())) return true;

        if(word.equals(word.toLowerCase())) return true;

        for(int i=1; i<word.length();i++) {
            if (Character.isUpperCase(word.charAt(i))){
                return false;
            }
        }
        return Character.isUpperCase(word.charAt(0));
    }
}