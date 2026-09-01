class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Remainder 0 has occurred once before starting
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            int rem = prefixSum % k;

            // Java can produce negative remainder
            if (rem < 0) {
                rem += k;
            }

            // Same remainder => subarray sum divisible by k
            count += map.getOrDefault(rem, 0);

            // Store frequency of remainder
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}