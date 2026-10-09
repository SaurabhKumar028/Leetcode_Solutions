class Solution {
    int helper(int i, int j, int[][] p, Integer[][] dp) {

        int n = p.length;
        int m = p[0].length;

        if (j < 0 || j >= m) {
            return Integer.MAX_VALUE;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        if (i == n - 1) {
            return dp[i][j] = p[i][j];
        }

        int c1 = helper(i + 1, j - 1, p, dp);
        int c2 = helper(i + 1, j, p, dp);
        int c3 = helper(i + 1, j + 1, p, dp);

        return dp[i][j] = p[i][j] + Math.min(c1, Math.min(c2, c3));
    }

    public int minFallingPathSum(int[][] p) {

        Integer[][] dp = new Integer[p.length][p[0].length];

        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < p[0].length; j++) {
            ans = Math.min(ans, helper(0, j, p, dp));
        }

        return ans;
    }
}