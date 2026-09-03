class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int num = nums[i];

            int tempMax = Math.max(
                num,
                Math.max(num * maxProduct, num * minProduct)
            );

            int tempMin = Math.min(
                num,
                Math.min(num * maxProduct, num * minProduct)
            );

            maxProduct = tempMax;
            minProduct = tempMin;

            ans = Math.max(ans, maxProduct);
        }

        return ans;
    }
}