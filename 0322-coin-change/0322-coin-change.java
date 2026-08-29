class Solution {
    int helper(int i, int[]coins,int amount ,int[][]dp){
        if(amount == 0)return 0;
        if(i >= coins.length || amount < 0)return Integer.MAX_VALUE;

        if(dp[i][amount] != -1)return dp[i][amount];
        int  c1 = helper(i , coins, amount-coins[i],dp);
        if(c1 != Integer.MAX_VALUE){
            c1 = 1+c1;
        }

        int c2 = helper(i+1 , coins ,amount,dp);

        return dp[i][amount] = Math.min(c1,c2);
    }
    public int coinChange(int[] coins, int amount) {
        int[][]dp = new int[coins.length][amount+1];

        for(int i =0; i< coins.length;i++){
            Arrays.fill(dp[i],-1);
        }

       int ans = helper(0,coins,amount,dp);

       if(ans == Integer.MAX_VALUE) return -1;
       else return ans;
    }
}