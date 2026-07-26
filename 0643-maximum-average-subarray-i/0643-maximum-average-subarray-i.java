class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wSum = 0;
        for(int i=0;i<k;i++){
            wSum += nums[i];
        }
        int mSum = wSum;
        for(int i=k;i<nums.length;i++){
            wSum = wSum - nums[i-k] + nums[i];

            if(wSum > mSum){
                mSum = wSum;
            }
        }
        return (double) mSum /k;
    }
}