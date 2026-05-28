class Solution {
    public boolean wifiRange(String s, int x) {
        // code here
        int n = s.length();

        // farthest covered room till now
        int coveredTill = -1;

        for (int i = 0; i < n; i++) {

            // router found
            if (s.charAt(i) == '1') {

                // this router starts covering from:
                int left = Math.max(0, i - x);

                // if there is a gap before this coverage
                if (left > coveredTill + 1) {
                    return false;
                }

                // extend coverage
                coveredTill = Math.max(coveredTill, i + x);
            }
        }

        // after processing all routers,
        // coverage must reach end
        return coveredTill >= n - 1;
    }
}