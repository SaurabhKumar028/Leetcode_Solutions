class Solution {

    boolean helper(String s, int i, int sum, Boolean[][] dp) {

        if (sum < 0) return false;

        if (i == s.length()) {
            return sum == 0;
        }

        if(dp[sum][i] !=null ) return dp[sum][i];

        boolean result;

        char ch = s.charAt(i);

        if (ch == '(') {
            result =  helper(s, i + 1, sum + 1,dp);
        }

        else if (ch == ')') {
            result =  helper(s, i + 1, sum - 1,dp);
        }

        else {
            result = helper(s, i + 1, sum + 1,dp) ||
                   helper(s, i + 1, sum - 1,dp) ||
                   helper(s, i + 1, sum,dp);
        }
        return dp[sum][i] = result;
    }

    public boolean checkValidString(String s) {

        Boolean[][] dp = new Boolean[s.length()][s.length()+1];

        return helper(s, 0, 0,dp);
    }
}