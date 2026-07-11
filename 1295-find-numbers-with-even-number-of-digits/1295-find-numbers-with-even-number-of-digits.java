class Solution {
    public int findNumbers(int[] nums) {
       int evenCount = 0;

       for(int i=0;i<nums.length;i++){
        int count = 0;
        int num = nums[i];

        if(num ==0){
            count=1;
        }else{
            while(num>0){
                num = num/10;
                count++;
            }
            if(count %2 == 0){
                evenCount++;
            }
        }
        
       }
       return evenCount;
    }
}