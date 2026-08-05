class Solution {
    public void rotate(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        k =k%n;
        int l = (n - k);
        
        for (int j = l ; j <= n - 1; j++) {
            list.add(arr[j]);
        }
        for (int i = 0; i < n - k; i++) {
            list.add(arr[i]);
        }
        for (int i=0; i<n ; i++) {
            arr[i] = list.get(i);
        }

    }
}