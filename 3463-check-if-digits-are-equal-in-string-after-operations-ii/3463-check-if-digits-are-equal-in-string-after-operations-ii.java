class Solution {

    public boolean hasSameDigits(String s) {
        int n = s.length();
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = s.charAt(i) - '0';
        }

        int a2 = calc(d, n, 2, true);
        int b2 = calc(d, n, 2, false);

        int a5 = calc(d, n, 5, true);
        int b5 = calc(d, n, 5, false);

        int x = crt(a2, a5);
        int y = crt(b2, b5);

        return x == y;
    }

    // main calculator
    private int calc(int[] d, int n, int mod, boolean first) {

        int res = 0;
        int N = n - 2;

        for (int i = 0; i <= N; i++) {

            int comb = binomMod(N, i, mod);

            int idx = first ? i : i + 1;

            res = (res + comb * d[idx]) % mod;
        }

        return res;
    }

    // C(n,k) mod p (p = 2 or 5)
    private int binomMod(int n, int k, int p) {

        if (k < 0 || k > n) return 0;

        if (p == 2) return lucas2(n, k);

        return lucas5(n, k);
    }

    // Lucas mod 2
    private int lucas2(int n, int k) {
        return ((n & k) == k) ? 1 : 0;
    }

    // Lucas mod 5
    private int lucas5(int n, int k) {

        int res = 1;

        while (n > 0 || k > 0) {

            int ni = n % 5;
            int ki = k % 5;

            if (ki > ni) return 0;

            res = (res * smallC(ni, ki)) % 5;

            n /= 5;
            k /= 5;
        }

        return res;
    }

    // small C(n,k) for n<5
    private int smallC(int n, int k) {

        int[][] C = {
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,2,1,0,0},
            {1,3,3,1,0},
            {1,4,6,4,1}
        };

        return C[n][k] % 5;
    }

    // CRT mod 10
    private int crt(int a, int b) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == a && i % 5 == b) {
                return i;
            }
        }

        return 0;
    }
}
