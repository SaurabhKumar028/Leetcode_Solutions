class Solution {
    // int[]dp = new int[400];

    int helper(int i , int[]days,int[]costs,int[] dp){
        if(i>= days.length)return 0;
        if(dp[i]!=-1) return dp[i];
        int curr = days[i];

        int one = costs[0]+helper(i+1,days,costs,dp);
        int seven ,thirty;
        int id1 = days.length;
        int id2 = days.length;
        for(int j= i+1;j< days.length;j++){
            if(days[j] >= curr+7){
                id1 = j;
                break;
            } 
        }
        for(int j= i+1;j< days.length;j++){
            if(days[j] >= curr+30){
                id2 = j;
                break;
            } 
        }
        seven = costs[1]+helper(id1,days,costs,dp);
        thirty = costs[2]+ helper(id2,days,costs,dp);

        return dp[i] = Math.min(one,Math.min(seven,thirty));
    }
    public int mincostTickets(int[] days, int[] costs) {
        int dp[] = new int[days.length+1];
        java.util.Arrays.fill(dp,-1);
       return helper(0,days,costs,dp);
    }
}