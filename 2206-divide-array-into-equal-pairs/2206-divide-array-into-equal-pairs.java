class Solution {
    public boolean divideArray(int[] arr) {
        if(arr.length %2!= 0) {
            return false;
        }
        HashMap <Integer, Integer> set = new HashMap <> ();
        for (int i=0; i<arr.length; i++) {
            set.put(arr[i] , set.getOrDefault(arr[i] , 0) +1);
        }

        for (int i=0; i< arr.length; i++) {
            if (set.get(arr[i]) % 2 != 0) {
                return false;
            }

        }
        return true;
    }
}