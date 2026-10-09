class Solution {
    int helper(int i, int j , int[][]grid,Integer [][] dp){
        int m = grid.length;
        int n = grid[0].length;

        if(i >= m ||j >=n)return Integer.MAX_VALUE;

        if(dp[i][j] != null){
            return dp[i][j];
        }

        if(i == m-1 && j == n-1){
            return dp[i][j] = grid[i][j];
        }

        int c1 =  helper(i+1,j ,grid,dp);
        int c2 =  helper(i , j+1,grid,dp);

       
        return dp[i][j] =  grid[i][j] + Math.min(c1,c2);
    }
    public int minPathSum(int[][] grid) {
        
        Integer [][] dp = new Integer[grid.length][grid[0].length];
        return helper(0,0,grid,dp);
    }
}