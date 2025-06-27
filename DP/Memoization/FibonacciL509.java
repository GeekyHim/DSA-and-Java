class Solution {
    public int helper(int n, int [] dp){
      if(n<=1) return n;
      if(dp[n]!=0) return dp[n];
      int ans = helper(n-1,dp)+ helper(n-2,dp);
      dp[n] = ans;
      return ans;
  }
    public int fib(int n) {
        int [] dp = new int [n+1];
        return helper(n,dp); 
    }
}

      // if(n<=1) return n;
      // if(dp[n]!=0) return dp[n];
      // return dp[n] = helper(n-1,dp)+ helper(n-2,dp);