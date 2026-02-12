class Solution {
    public int[] runningSum(int[] arr) {
        int[] ps = new int [arr.length];
        ps[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            ps[i] = ps[i-1] + arr[i];
        
        }
            return ps;
        
    }
}