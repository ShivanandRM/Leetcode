class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(correct<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums, int start, int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}