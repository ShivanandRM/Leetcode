class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        int ans = 0;

        if(x ==0 || x==1){
            return x;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            long square = (long) mid*mid;

            if(square > x){
                end = mid -1;
            }else if(square < x){
                ans = mid;
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return ans;
    }
}