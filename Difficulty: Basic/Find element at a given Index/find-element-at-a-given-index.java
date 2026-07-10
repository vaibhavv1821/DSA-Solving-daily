class Solution {
    public int findElementAtIndex(int k, int[] arr) {
        int ans=0;
        for(int i=0; i<arr.length; i++){
            if(k==i){
                ans+=arr[i];
            }
        }
        return ans;
    }
}