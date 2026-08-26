class Solution {
    
            // TABULATION METHOD -- > 


         public int rob(int[] nums){
            int n = nums.length;
            int[]dp = new int[n];
            dp[0] = nums[0];
            if(n > 1){
                dp[1] = Math.max(dp[0],nums[1]);
            }
            for(int i = 2;i < n;i++){
                dp[i] =  Math.max(nums[i] + dp[i-2], dp[i-1]);
            }
            return dp[n-1];
        }

    // MEMOISATION -- > 


    // public int helper(int i, int[] nums, int[] dp) {
    //     if (i >= nums.length)
    //         return 0;
    //     if (dp[i] != -1)
    //         return dp[i];

    //     int loot = nums[i] + helper(i + 2, nums, dp);
    //     int skip = helper(i + 1, nums, dp);

    //     return dp[i] = Math.max(loot, skip);
    // }

    // public int rob(int[] nums) {
    //     int n = nums.length;
    //     int[] dp = new int[n + 1];
    //     Arrays.fill(dp, -1);

    //     return helper(0, nums, dp);
    // }
}