class Solution {
    public void reverseArray(int arr[]) {
        int p=0;
        int i=arr.length-1;
        
        while(p < i){
            int temp = arr[p];
            arr[p]=arr[i];
            arr[i]=temp;
        p++;
        i--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna