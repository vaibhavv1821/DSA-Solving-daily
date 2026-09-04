class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double sum =0;
        double avg = 0;
        double max = Double.NEGATIVE_INFINITY;

        for (int i=0; i<k; i++){
            sum += arr[i];
            avg = sum/k;
        }
         max = Math.max(max,avg);
        for (int i=k; i<arr.length;i++){
            sum += arr[i];
            sum -= arr[i-k];
            avg = sum/k;
            max = Math.max(max,avg);
        }

        
        return max;
    }
}