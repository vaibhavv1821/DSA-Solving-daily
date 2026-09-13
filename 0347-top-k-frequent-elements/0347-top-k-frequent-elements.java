class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Create buckets
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int n : map.keySet()) {

            int freq = map.get(n);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(n);
        }

        int[] ans = new int[k];
        int index = 0;

        // Start from highest frequency
        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {

                for (int n : bucket[i]) {

                    ans[index] = n;
                    index++;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return ans;
    }
}