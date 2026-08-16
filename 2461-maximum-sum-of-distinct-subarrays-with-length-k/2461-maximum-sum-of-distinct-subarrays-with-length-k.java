class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long window = 0;
        long ans = 0;
        for(int i=0;i<k;i++){
            window += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        if(map.size()==k){
            ans = window;
        }
        for(int i = k;i<nums.length;i++){
            int outgoing = nums[i-k];
            window -= outgoing;
            map.put(outgoing, map.getOrDefault(outgoing,0)-1);

            if(map.get(outgoing)==0){
                map.remove(outgoing);
            }
            
            int incoming = nums[i];
            window += incoming;
            map.put(incoming, map.getOrDefault(incoming, 0)+1);
            if(map.size()==k){
                ans = Math.max(ans, window);
            }
        }
        return ans;
    }
}