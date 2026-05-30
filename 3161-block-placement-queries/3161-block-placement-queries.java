import java.util.*;

class Solution {
    int[] bit;

    private void update(int idx, int val) {
        while (idx < bit.length) {
            bit[idx] = Math.max(bit[idx], val);
            idx += idx & -idx;
        }
    }

    private int query(int idx) {
        int res = 0;
        while (idx > 0) {
            res = Math.max(res, bit[idx]);
            idx -= idx & -idx;
        }
        return res;
    }

    public List<Boolean> getResults(int[][] queries) {
        int maxPos = 0;

        for (int[] q : queries) {
            maxPos = Math.max(maxPos, q[1]);
        }

        maxPos++;

        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        set.add(maxPos);

        for (int[] q : queries) {
            if (q[0] == 1) {
                set.add(q[1]);
            }
        }

        bit = new int[maxPos + 5];

        Integer prev = null;
        for (int x : set) {
            if (prev != null) {
                update(x, x - prev);
            }
            prev = x;
        }

        List<Boolean> ans = new ArrayList<>();

        for (int i = queries.length - 1; i >= 0; i--) {
            int[] q = queries[i];

            if (q[0] == 1) {
                int x = q[1];

                Integer left = set.lower(x);
                Integer right = set.higher(x);

                update(right, right - left);

                set.remove(x);
            } else {
                int x = q[1];
                int sz = q[2];

                Integer right = set.higher(x);
                Integer left = set.lower(right);

                boolean ok = query(left) >= sz || (x - left) >= sz;

                ans.add(ok);
            }
        }

        Collections.reverse(ans);
        return ans;
    }
}