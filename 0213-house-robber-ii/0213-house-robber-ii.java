class Solution {

    int helper(int i ,int flag, int[][]dp,int[]nums){

        if(i >= nums.length)return 0;

        if(i == nums.length-1){
            if(flag == 0) return nums[i];
            return 0;
        }
        int res = 0;
        if(dp[i][flag] != -1)return dp[i][flag];

        if(i == 0){
            int c1 = nums[i] + helper(i+2,1,dp,nums);
            int c2 = helper(i+1,flag,dp,nums);

            res = Math.max(c1,res);
            res = Math.max(c2,res);
        }
        else{
            int c1 = nums[i] + helper(i+2,flag,dp,nums);
            int c2 = helper(i+1,flag,dp,nums);
            res = Math.max(c1,res);
            res = Math.max(c2,res);
        }

        return dp[i][flag] = res;

    }

    public int rob(int[] nums) {
        int[][] dp = new int[110][2];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(0, 0, dp, nums);
    }
}