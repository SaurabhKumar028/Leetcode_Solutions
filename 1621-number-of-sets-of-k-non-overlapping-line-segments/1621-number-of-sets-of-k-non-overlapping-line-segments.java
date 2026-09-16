class Solution {


    // TLE ---- > 


    // int M = 1_000_000_007; ;
    // int helper(int i, int n,int k,int[][]dp){

    //     if(i >= n)return 0;

    //     if(k==0) return 1;

    //     if(dp[i][k] != -1){
    //         return dp[i][k];

    //     }


    //     long take = 0;
    //     for(int j =i+1;j < n;j++){
    //         take = (take+helper(j,n,k-1,dp))%M;
    //     }

    //     long skip = helper(i+1,n,k,dp)%M;

    //     return dp[i][k] = (int)((skip + take))%M;

        
        
    // }
    // public int numberOfSets(int n, int k) {
    //     int [][] dp = new int[1002][1002];

    //     for(int i = 0;i< dp.length;i++){
    //         java.util.Arrays.fill(dp[i],-1);
    //     }

    //     return helper(0,n,k,dp);
    // }


    int M = 1_000_000_007;
    int[][] dp;
    int[][] sumDp;

    int helper(int i, int k) {

        if (k == 0) return 1;
        if (i == 0) return 0;

        if (dp[i][k] != -1) {
            return dp[i][k];
        }

        long take = getSum(i, k - 1);
        long skip = helper(i - 1, k);

        return dp[i][k] = (int)((skip + take) % M);
    }

    int getSum(int i, int k) {

        if (i == 0) return 0;

        if (sumDp[i][k] != -1) {
            return sumDp[i][k];
        }

        long ans = getSum(i - 1, k);
        ans = (ans + helper(i - 1, k)) % M;

        return sumDp[i][k] = (int)ans;
    }

    public int numberOfSets(int n, int k) {

        dp = new int[n][k + 1];
        sumDp = new int[n][k + 1];

        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
            java.util.Arrays.fill(sumDp[i], -1);
        }

        return helper(n - 1, k);
    }
}
