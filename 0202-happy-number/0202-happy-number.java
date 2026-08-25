class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {

            // If we see the same number again, a cycle exists
            if (set.contains(n)) {
                return false;
            }

            // Store the number
            set.add(n);

            int sum = 0;

            // Find sum of squares of digits
            while (n > 0) {

                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            // Use the new sum for the next iteration
            n = sum;
        }

        return true;
    }
}