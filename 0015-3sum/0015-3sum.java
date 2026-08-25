class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Fix the first number
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first numbers
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            // Step 3: Two pointer approach
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(
                        nums[i],
                        nums[left],
                        nums[right]
                    ));

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } 
                else if (sum < 0) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }

        return ans;
    }
}