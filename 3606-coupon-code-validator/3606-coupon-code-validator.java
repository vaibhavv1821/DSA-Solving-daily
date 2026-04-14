import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        // Step 1: Define business line order
        Map<String, Integer> order = new HashMap<>();
        order.put("electronics", 0);
        order.put("grocery", 1);
        order.put("pharmacy", 2);
        order.put("restaurant", 3);

        List<String[]> validCoupons = new ArrayList<>();

        // Step 2: Validate coupons
        for (int i = 0; i < code.length; i++) {

            // Check active
            if (!isActive[i]) continue;

            // Check businessLine valid
            if (!order.containsKey(businessLine[i])) continue;

            // Check code valid
            if (code[i] == null || code[i].isEmpty()) continue;

            // Regex check: only alphanumeric + underscore
            if (!code[i].matches("[a-zA-Z0-9_]+")) continue;

            // Store valid coupon
            validCoupons.add(new String[]{code[i], businessLine[i]});
        }

        // Step 3: Sort
        Collections.sort(validCoupons, (a, b) -> {
            int cmp = order.get(a[1]) - order.get(b[1]);
            if (cmp != 0) return cmp;
            return a[0].compareTo(b[0]);
        });

        // Step 4: Extract result
        List<String> result = new ArrayList<>();
        for (String[] coupon : validCoupons) {
            result.add(coupon[0]);
        }

        return result;
    }
}