class Solution {

    int helper(int i, int sum, int n,int[][]dp) {

        if (sum == n)
            return 0;
        if (sum > n)
            return Integer.MAX_VALUE / 2;

        if(dp[i][sum] != -1){
            return dp[i][sum];
        }

        int c1 = Integer.MAX_VALUE;
        int c2 = Integer.MAX_VALUE;

        if (sum + i <= n) {
            int x = helper(i + 1, sum + i, n,dp);

            if (x != Integer.MAX_VALUE / 2) {
                c1 = 1 + x;
            }
        }

        

        if (i > 1) {
            int x1 = helper(1, sum, n,dp);
            if (x1 != Integer.MAX_VALUE / 2) {
                c2 = 1 + x1;
            }
        }
        return dp[i][sum] = Math.min(c1, c2);
    }

    public int minDays(int n) {
        int[][] dp = new int[460][n];

        for(int i = 0 ;i < dp.length;i++){
        java.util.Arrays.fill(dp[i],-1);
        }

        return helper(1, 0, n,dp);
    }
}