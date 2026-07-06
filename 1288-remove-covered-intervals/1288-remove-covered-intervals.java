class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1]; 
            }
            return a[0] - b[0]; 
        });

        int st = intervals[0][0];
        int end = intervals[0][1];

        int res = intervals.length;

        for (int i = 1; i < intervals.length; i++) {
            int currSt = intervals[i][0];
            int currEnd = intervals[i][1];

            if (st <= currSt && end >= currEnd) {
                res--;
            } else {
                st = currSt;
                end = currEnd;
            }
        }
        return res;
    }
}