class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        if(num == 0 || num ==1){
            return true;
        }
        while(start <= end){
            int mid = start + (end - start )/2;
            long square = (long) mid * mid;

            if(square == num){
                return true;
            }else if(square >num){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
           
        }
        return false;
    }
}