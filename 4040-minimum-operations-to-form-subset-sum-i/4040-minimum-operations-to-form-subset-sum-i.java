class Solution {

    int helper(int i, int[] nums, int sum, int[][] dp) {
        if (sum == 0)
            return 0;

        if (i >= nums.length || sum < 0)
            return Integer.MAX_VALUE;

        if (dp[i][sum] != -1)
            return dp[i][sum];

        int ans = Integer.MAX_VALUE;
        int x = nums[i];
        int c = 0;

        while (true) {
            int y = x;
            int div = 0;
            while (y > 0) {
                int next = helper(i + 1, nums, sum - y, dp);

                if (next != Integer.MAX_VALUE) {
                    ans = Math.min(ans, div + c + next);
                }
                y /= 2;
                div++;
            }
            if (x > sum / 2)
                break;

            x = x * 2;
            c++;
        }

        int skip = helper(i + 1, nums, sum, dp);
        ans = Math.min(ans, skip);

        return dp[i][sum] = ans;
    }

    public int minOperations(int[] nums, int sum) {

        int[][] dp = new int[nums.length][sum + 1];

        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
    

    int ans =  helper(0,nums,sum ,dp);
    
    if(ans==Integer.MAX_VALUE)return-1;

    return ans;
    }
    // int helper(int i, int[] nums, int sum, int[][] dp) {
    //     if (sum == 0)
    //         return 0;
    //     if (i >= nums.length || sum < 0)
    //         return Integer.MAX_VALUE;

    //     if (dp[i][sum] != -1)
    //         return dp[i][sum];

    //     int ans = Integer.MAX_VALUE;

    //     int x = nums[i];
    //     int c = 0;

    //     while (true) {
    //         int y = x;
    //         int div = 0;

    //         while (y > 0 ) {
    //             int next = helper(i + 1, nums, sum - y, dp);

    //             if (next != Integer.MAX_VALUE) {
    //                 ans = Math.min(ans, c + div + next);
    //             }
    //             y = y / 2;
    //             div++;
    //         }
    //         if(x > sum/2)break;
    //         x = x * 2;
    //         c++;
    //     }
    //     int skip = helper(i + 1, nums, sum, dp);
    //     ans = Math.min(ans, skip);
    //     return dp[i][sum] = ans;
    // }

    // public int minOperations(int[] nums, int sum) {
    //     int[][] dp = new int[nums.length][sum + 1];

    //     for (int i = 0; i < nums.length; i++) {
    //         Arrays.fill(dp[i], -1);
    //     }
    //     int res = helper(0, nums, sum, dp);

    //     if (res == Integer.MAX_VALUE)
    //         return -1;

    // return res;
}