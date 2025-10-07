public class HouseRobber {
    
}

// // TAKE AND SKIP APPROACH
class Solution { 
    public int max(int pos, int[] nums, int[] dp){
        if(pos>=nums.length) return 0; 
        if(dp[pos]!=-1) return dp[pos];
        int take = nums[pos] + max(pos+2,nums,dp); // pos + 2 coz adjacent wala nhi kar skta
        int skip =  max(pos+1,nums,dp); // since standing pos nhi kiya agla kar skta hu
        return dp[pos] = Math.max(take,skip); 
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n];
        Arrays.fill(dp,-1);
        return max(0,nums,dp);
    }
}

// either x se 3rd or 2nd pos pe jayega [CORRECTLY WORKING]
// class Solution {
//     public int helper(int pos, int[] nums, int[] dp){
//         if((nums.length-1-pos) < 2) return nums[pos];
//         if((nums.length-1-pos) == 2) return nums[pos] + nums[pos+2];
//         if(dp[pos]!=-1) return dp[pos];
//         dp[pos] = nums[pos] + Math.max(helper(pos+2,nums,dp),helper(pos+3,nums,dp));
//         return dp[pos];
//     }
//     public int rob(int[] nums) {
//         int n = nums.length;
//         if(n==1) return nums[0];
//         int [] dp = new int[n+1];
//         Arrays.fill(dp,-1);
//         return Math.max(helper(0,nums,dp),helper(1,nums,dp));
//     }
// }
