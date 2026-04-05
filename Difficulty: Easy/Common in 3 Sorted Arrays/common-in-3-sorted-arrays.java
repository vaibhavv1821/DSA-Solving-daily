import java.util.*;

class Solution {
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        
        HashSet<Integer> set1 = new HashSet<>(arr1);
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();
        
        for (int num : arr2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        
        for (int num : arr3) {
            if (set2.contains(num)) {
                resultSet.add(num);
            }
        }
        
        List<Integer> result = new ArrayList<>(resultSet);
        Collections.sort(result); // ⭐ IMPORTANT LINE
        
        return result;
    }
}