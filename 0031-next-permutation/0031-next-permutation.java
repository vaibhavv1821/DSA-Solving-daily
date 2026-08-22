class Solution {
    public void nextPermutation(int[] arr) {
        int pivot = -1;
        
        // Step 1: Find pivot
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }
        
        // Step 2: If pivot found, swap with next greater element
        if (pivot != -1) {
            for (int i = arr.length - 1; i > pivot; i--) {
                if (arr[i] > arr[pivot]) {
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                    break;
                }
            }
        }
        
        // Step 3: Reverse suffix (important!)
        reverse(arr, pivot + 1, arr.length - 1);
    }
    
    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
