class Solution {
	public int findMinDiff(int arr[], int k) {
		Arrays.sort(arr);
		
		int left = 0;
		int right = k - 1;
		int min = Integer.MAX_VALUE;
		
		while (right<arr.length) {
			
			int ans = arr[right] - arr[left];
			min = Math.min(min, ans);
			left++;
			right++;
		}
		return min;
	}
}
