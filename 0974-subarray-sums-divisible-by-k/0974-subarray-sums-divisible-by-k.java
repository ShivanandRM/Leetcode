class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       HashMap<Integer,Integer> map =new HashMap<>();
        int count=0;
        int prefixSum = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
        
        int required = ((prefixSum%k)+k)%k;
        if(map.containsKey(required)){
            count += map.get(required);
        }
        map.put(required, map.getOrDefault(required, 0)+1);
        }
        return count;
    }
}