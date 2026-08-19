class Solution {
    public void moveZeroes(int[] nums) {
        int w=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r] != 0){
                nums[w] = nums[r];
                w++;
            }
        }
        for(int i=w;i<nums.length;i++) {
            nums[i]=0;
        }
    }
}