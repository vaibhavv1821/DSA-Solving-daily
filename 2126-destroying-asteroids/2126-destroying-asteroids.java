import java.util.Arrays;

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {

        // Sort asteroids from smallest to largest
        Arrays.sort(asteroids);

        // Use long to avoid overflow
        long currentMass = mass;

        for (int asteroid : asteroids) {

            // If planet cannot destroy current asteroid
            if (currentMass < asteroid) {
                return false;
            }

            // Absorb asteroid mass
            currentMass += asteroid;
        }

        return true;
    }
}