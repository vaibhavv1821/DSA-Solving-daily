class Solution {
    
    public boolean isSorted(int[] arr) {
        int l =0;
        int r =0;
        
        for(int i=1; i<arr.length;i++){
            if(arr[i] <arr[i-1]){
                return false;
            }
                // i++;
        }
        return true;
    }
}