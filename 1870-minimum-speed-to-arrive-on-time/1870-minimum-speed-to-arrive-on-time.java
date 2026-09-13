class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        // Impossible case
        if (hour <= n - 1) {
            return -1;
        }
        int low = 1;
        int high = 10_000_000;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            double time = 0;
            for (int i = 0; i < n - 1; i++) {
                time += Math.ceil((double) dist[i] / mid);
            }
            // Last train does not need to be rounded up
            time += (double) dist[n - 1] / mid;
            if (time <= hour) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low > 10_000_000 ? -1 : low;
    }
}