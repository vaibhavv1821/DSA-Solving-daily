import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                return true;   
            }
            set.add(num);
        }

        return false;   
    }
}
