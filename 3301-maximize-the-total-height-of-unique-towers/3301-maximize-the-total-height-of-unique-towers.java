class Solution {
    public long maximumTotalSum(int[] arr) {
        long sum = 0;
        int n = arr.length;

        Arrays.sort(arr);

        long max = (long)1e18;  // allowed highest height for current tower

        for (int i = n - 1; i >= 0; i--) {
            long h = Math.min(arr[i], max - 1);

            if (h <= 0) return -1;

            sum += h;
            max = h;     // next tower must be strictly smaller
        }

        return sum;
    }
}
