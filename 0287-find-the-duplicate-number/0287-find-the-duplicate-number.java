class Solution {
    public int findDuplicate(int[] nums) {
        int i =0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;

                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];   // Duplicate found
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    //     while(i < nums.length){
    //         int correct = nums[i] - 1;
    //         if(nums[i] != nums[correct]){
    //             swap(nums, i ,correct);
    //         }else{
    //             i++;
    //         }
    //     }
    //     for(int index = 0; index < nums.length;index++){
    //         if(nums[index] != index +1){
    //             return nums[index];
    //         }
    //     }
    //     return -1;
    // }
    // static void swap(int[] nums, int start, int end){
    //     int temp = nums[start];
    //     nums[start] = nums[end];
    //     nums[end] = temp;
    // }

}