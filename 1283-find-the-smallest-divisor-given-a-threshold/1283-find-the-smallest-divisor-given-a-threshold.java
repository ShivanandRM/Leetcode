class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        // Find maximum value
        for (int num : nums) {
            right = Math.max(right, num);
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sum = 0;
            for (int num : nums) {
                // Ceiling of num / mid
                sum += (num + mid - 1) / mid;
            }
            if (sum <= threshold) {
                // mid works, try smaller divisor
                right = mid - 1;
            } else {
                // mid is too small
                left = mid + 1;
            }
        }
        return left;
    }
}