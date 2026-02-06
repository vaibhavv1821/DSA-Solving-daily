import java.util.*;

class Solution {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Find majority
        for (int key : map.keySet()) {

            if (map.get(key) > nums.length / 2) {
                return key;
            }
        }

        return -1; 
    }
}
