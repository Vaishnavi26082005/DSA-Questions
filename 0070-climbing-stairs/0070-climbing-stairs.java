class Solution {
    public int climbStairs(int n) {
       int dp[]= new int[n+1];
       Arrays.fill(dp,-1);
       return solve(dp,n);


    }
    public int solve(int[]dp,int i){
        if(i<=2)return dp[i]=i;
        if(dp[i]!=-1)return dp[i];
       return dp[i]=solve(dp,i-1)+solve(dp,i-2);
    }
}