class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, 0, 0, target);
    }
    static int helper(int[] nums, int index, int sum, int target) {
        if (index == nums.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        int plus = helper(nums, index + 1,sum + nums[index], target);
        int minus = helper(nums, index + 1,sum - nums[index], target);
        return plus + minus;
        }
}