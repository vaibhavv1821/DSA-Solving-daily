class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {

                int w = j - i;
                int ht = Math.min(height[i], height[j]);

                int currWater = w * ht;

                maxWater = Math.max(maxWater, currWater);
            }
        }

        return maxWater;
    }
}
