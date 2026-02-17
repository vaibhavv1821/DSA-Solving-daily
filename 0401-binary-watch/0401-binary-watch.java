class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();

        // try every possible hour and minute
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {

                // count total ON LEDs
                int bits = Integer.bitCount(h) + Integer.bitCount(m);

                if (bits == turnedOn) {
                    // format minute to always have 2 digits
                    ans.add(h + ":" + String.format("%02d", m));
                }
            }
        }

        return ans;
    }
}
