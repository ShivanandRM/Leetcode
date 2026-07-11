class Solution {
    public int[] runningSum(int[] nums) {
        int[] running = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            running[i] = sum;
        }
        return running;
    }
}