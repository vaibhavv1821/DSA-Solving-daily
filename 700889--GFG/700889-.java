class Solution {
    public void reverseArray(int arr[]) {
        reverseHelper(arr, 0, arr.length - 1);
    }
    
    private void reverseHelper(int arr[], int left, int right) {
                if (left >= right) {
            return;
        }
        
               int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
        // Recursive call: move the pointers inward
        reverseHelper(arr, left + 1, right - 1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna