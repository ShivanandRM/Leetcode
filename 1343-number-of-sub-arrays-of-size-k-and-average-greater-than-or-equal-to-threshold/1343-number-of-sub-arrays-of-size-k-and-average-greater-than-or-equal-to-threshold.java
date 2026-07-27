class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int wSum = 0;
        int count = 0;
        for(int i =0;i<k;i++){
            wSum += arr[i];
        }
        double avg = wSum / k;
        if(avg >= threshold){
            count++;
        }
        for(int i =k;i<arr.length;i++){
            wSum = wSum - arr[i-k]+arr[i];
            avg = wSum / k;
            if(avg >= threshold){
                count++;
            }
        }
    return count ;
    }
}