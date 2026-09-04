class Solution {
	public int maxSubarraySum(int[] arr, int k) {
		
		// int i=0;
		int sum = 0;
		int max = 0;
		
		for (int i = 0; i<k; i++) {
			sum += arr[i];
			
		}
		
		max = Math.max(sum, max);
		for (int j = k; j<arr.length; j++) {
		    sum += arr[j];
		    sum -=arr[j-k];
		    max = Math.max(sum, max);
		}
		return max;
	}
}
