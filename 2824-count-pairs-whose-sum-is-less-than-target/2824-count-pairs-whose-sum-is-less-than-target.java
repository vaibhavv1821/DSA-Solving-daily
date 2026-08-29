class Solution {
    public int countPairs(List<Integer> arr, int target) {

        Collections.sort(arr);

        int count = 0;
        int i = 0;
        int j = arr.size() - 1;

        while (i < j) {

            int sum = arr.get(i) + arr.get(j);

            if (sum < target) {
                count += j - i;
                i++;
            } else {
                j--;
            }
        }

        return count;
    }
}