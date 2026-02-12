class NumArray {

    int[] ps;

    public NumArray(int[] arr) {
        ps = new int[arr.length];

        ps[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            ps[i] = ps[i - 1] + arr[i];
        }
    }

        public int sumRange(int left, int right) {

        if (left == 0) {
            return ps[right];
        }

        return ps[right] - ps[left - 1];
    }
}

    


