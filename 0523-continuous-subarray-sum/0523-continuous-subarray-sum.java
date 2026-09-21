class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];

            int reminder = prefixSum % k;

            if(map.containsKey(reminder)){
                if(i-map.get(reminder)>= 2){
                    return true;
                }
            }
            if (!map.containsKey(reminder)) {
                map.put(reminder, i);
            }
        }
        return false;
    }
}