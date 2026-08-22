class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int preSum = 0;
        map.put(0,1);
        for(int r=0;r<nums.length;r++){
            preSum += nums[r];
            int target = preSum - k;
            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(preSum, map.getOrDefault(preSum,0)+1);
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