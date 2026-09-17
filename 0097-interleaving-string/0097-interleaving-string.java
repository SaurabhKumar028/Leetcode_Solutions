class Solution {

    boolean helper(int i, int j, String s, String t, String p,int[][]dp) {

        if (i == s.length() && j == t.length()) {
            return true;
        }
        if(dp[i][j] != -1){
            return dp[i][j] == 1;
        }

        int k = i + j;

        boolean c1 = false;
        boolean c2 = false;

        if (i < s.length() && s.charAt(i) == p.charAt(k)) {
            c1 = helper(i + 1, j, s, t, p,dp);
        }

        if (j < t.length() && t.charAt(j) == p.charAt(k)) {
            c2 = helper(i, j + 1, s, t, p,dp);
        }
        boolean ans = c1 ||c2;
        dp[i][j] = ans ? 1:0;
        return ans;
    }

    public boolean isInterleave(String s, String t, String p) {
        int[][] dp = new int[220][220];

        for(int i = 0;i < dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        if (s.length() + t.length() != p.length()) {
            return false;
        }

        return helper(0, 0, s, t, p,dp);
    }
}




// NOT A LCS PROBLEM -- > WRONG LOGIC :



// class Solution {

//     boolean helper(int i, int j, String s, String p) {
//         int n = s.length();
//         int m = p.length();

//         if (i >= n)
//             return true;

//         if (j >= m)
//             return false;

//         if (s.charAt(i) == p.charAt(j)) {
//             return helper(i + 1, j + 1, s, p);
//         } else {
//             return helper(i, j + 1, s, p);
//         }
//     }

//     boolean helper2(int i, int j, String t, String p) {
//         int n = t.length();
//         int m = p.length();

//         if (i >= n)
//             return true;

//         if (j >= m)
//             return false;

//         if (t.charAt(i) == p.charAt(j)) {
//             return helper2(i + 1, j + 1, t, p);
//         } else {
//             return helper2(i, j + 1, t, p);
//         }
//     }

//     public boolean isInterleave(String s, String t, String p) {

//         int n = s.length();
//         int m = t.length();
//         int k = p.length();

//         boolean res1 = helper(0, 0, s, p);
//         boolean res2 = helper2(0, 0, t, p);

//         if (res1 && res2 && (n + m) == k)
//             return true;

//         return false;
//     }
// }