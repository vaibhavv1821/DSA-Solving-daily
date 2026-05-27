class Solution {

    int minToggle(int[] arr) {

        int zerosRight = 0;

        // count total zeros
        for (int num : arr) {

            if (num == 0) {
                zerosRight++;
            }
        }

        int onesLeft = 0;

        int ans = zerosRight;

        // move partition
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {

                onesLeft++;

            } else {

                zerosRight--;
            }

            ans = Math.min(ans, onesLeft + zerosRight);
        }

        return ans;
    }
}