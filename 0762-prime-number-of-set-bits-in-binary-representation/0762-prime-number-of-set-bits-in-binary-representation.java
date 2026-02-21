class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        
        // primes up to 20
        boolean[] isPrime = new boolean[21];
        int[] primes = {2,3,5,7,11,13,17,19};
        for(int p : primes) isPrime[p] = true;
        
        for(int i = left; i <= right; i++){
            int bits = Integer.bitCount(i); // count 1s in binary
            if(isPrime[bits]) count++;
        }
        
        return count;
    }
}