class Solution {
    public int subarraySum(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();

        // prefix sum 0 occurs once before the array starts
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            // We need an earlier prefix sum = prefixSum - k
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Store frequency of current prefix sum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;

        // int count = 0;
        // for(int i=0;i<nums.length;i++){
        //     int sum = 0;
        //     for(int j=i;j<nums.length;j++){
        //         sum += nums[j];
        //         if(sum==k){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}