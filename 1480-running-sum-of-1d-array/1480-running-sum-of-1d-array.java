class Solution {
    public int[] runningSum(int[] nums) {
        int[] running = new int[nums.length];
        running[0]=nums[0];
        for (int i = 1; i < running.length; i++) {
            running[i]=running[i-1]+nums[i];
        }
        return running;
    }
}