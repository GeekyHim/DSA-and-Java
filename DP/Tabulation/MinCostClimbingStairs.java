// DP TABULATION APPROACH 
class Solution{
    public int minCostClimbingStairs(int[] cost) {
        int [] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2;i<cost.length;i++){
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}


// // DP approach (Memoization)
// class Solution {
//     public int helper(int step, int[] cost,int[] dp){
//       if(step==0) return cost[0];
//       if(step==1) return cost[1];
//       if(dp[step]!=-1) return dp[step];
//       dp[step] =  cost[step] + Math.min(helper(step-1,cost,dp),helper(step-2,cost,dp)); 
//       return dp[step];
//     }
//     public int minCostClimbingStairs(int[] cost) {
//       int step = cost.length-1;
//       int[] dp = new int[step+1];
//       Arrays.fill(dp,-1);
//       dp[step] = helper(step,cost,dp);
//       dp[step-1] = helper(step-1,cost,dp);
//       int ans = Math.min(dp[step],dp[step-1]);
//       return ans;
//     }
// }


// TLE Top down approach
// class Solution {
//     public int helper(int step, int money , int[] cost){
//       if(step==0) return money += cost[0];
//       if(step==1) return money += cost[1];
//       money += cost[step];
//       return Math.min(helper(step-1,money,cost),helper(step-2,money,cost));
//     }
//     public int minCostClimbingStairs(int[] cost) {
//       int money = 0; int step = cost.length-1;
//       int ans = Math.min(helper(step,money,cost),helper(step-1,money,cost));
//       return ans;
//     }
// }


// TLE bottom up approach
// class Solution {
//     public int helper(int step, int money , int[] cost){
//       if(step==cost.length) return money;
//       if(step==cost.length-1) return money += cost[step];
//       money += cost[step];
//       return Math.min(helper(step+1,money,cost),helper(step+2,money,cost));
//     }
//     public int minCostClimbingStairs(int[] cost) {
//       int money = 0;
//       int ans = Math.min(helper(0,money,cost),helper(1,money,cost));
//       return ans;
//     }
// }