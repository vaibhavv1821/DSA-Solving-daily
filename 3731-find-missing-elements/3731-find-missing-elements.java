class Solution {
    public List<Integer> findMissingElements(int[] arr) {

        Arrays.sort(arr);

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {

            int diff = arr[i] - arr[i - 1];

            if (diff > 1) {

                for (int j = 1; j < diff; j++) {
                    list.add(arr[i - 1] + j);
                }

            }
        }

        return list;
    }
}