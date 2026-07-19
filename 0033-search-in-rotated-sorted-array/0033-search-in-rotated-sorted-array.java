class Solution {
    public int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        if(pivot == -1){
            //when the given array is not a rotated array, just simply do the normal binartSearch.
            return binarySearch(nums, target, 0, nums.length-1);
        }
        //when we got the pivot in roatated sorted array do this cases 
        if(nums[pivot] == target){
            return pivot;
        }else if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }else{
            return binarySearch(nums, target, pivot+1, nums.length-1);
        }


    }
    public int binarySearch(int[] nums, int target, int start, int end){
        //when the array is not rotated , means pivot == -1
        while(start<= end){
            int mid = start + (end - start)/2;
            if(target<nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public int findpivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }else if(mid > start && nums[mid]<nums[mid-1]){
                return mid - 1;
            }else if(nums[start]>=nums[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
}