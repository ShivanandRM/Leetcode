class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return solve(n,dp);
    }
    private int solve(int n, int[] dp){
        if(n<=1){
            return 1;
        }
        //Already calculated 
        if(dp[n] != 0){
            return dp[n];
        }
        // calculate and store
        dp[n]=solve(n-1, dp)+solve(n-2, dp);
        return dp[n];
    }
}