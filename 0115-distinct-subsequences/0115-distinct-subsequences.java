class Solution {
    int helper(int i,int p, String s, String t,int[][]dp){
        if(p>= t.length()){
            return 1;
        }
        if(i >= s.length())return 0;

        if(dp[i][p] != -1){
            return dp[i][p];
        }
        int ans = 0;
        if(s.charAt(i) == t.charAt(p)){
            int a = helper(i+1,p+1,s,t,dp);
            int b = helper(i+1,p,s,t,dp);



            ans = a+b;
        }
        else{
            int a = helper(i+1,p,s,t,dp);
            ans =a;
        }
        return dp[i][p] = ans;
    }
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];

        for(int i = 0; i < dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,0,s,t,dp);
    }
}

















// class Solution {
//     public int numDistinct(String s, String t) {

//         int n = s.length();
//         int m = t.length();

//         long[][] dp = new long[n + 1][m + 1];
//         dp[0][0] = 1;

//         for (int i = 1; i <= n; i++) {
//             dp[i][0] = 1;
//         }

//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= m; j++) {

               
//                 dp[i][j] = dp[i - 1][j];

   
//                 if (s.charAt(i - 1) == t.charAt(j - 1)) {
//                     dp[i][j] += dp[i - 1][j - 1];
//                 }
//             }
//         }

//         return (int) dp[n][m];
//     }
// }