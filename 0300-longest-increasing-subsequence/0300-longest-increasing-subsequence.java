class Solution {

    public int lengthOfLIS(int[] nums){
        ArrayList<Integer> ar = new ArrayList<>();

        for(int a : nums){
            if(ar.size()== 0 || ar.get(ar.size()-1) < a){
                ar.add(a);
            }
            else{
                for(int i = 0; i < ar.size();i++){
                    if(ar.get(i) >= a){
                        ar.set(i,a);
                        break;
                    }
                }
            }
        }
        return ar.size();
    }







    // int helper(int i ,int[]nums,int[]dp){
    //     if(i > nums.length){
    //         return 0;
    //     }

    //     if(dp[i] != -1){
    //         return dp[i];
    //     }
    //     int ans = 0;
       

    //     for(int j = i+1;j < nums.length;j++){
    //          int count = 0;
           
    //         if(nums[j] > nums[i]){
    //             count = 1 + helper(j,nums,dp);
                
    //         }
    //         ans = Math.max(ans,count);
      
    //     }
    //     return dp[i] = ans;
    // }
    // public int lengthOfLIS(int[] nums) {
    //     int[]dp = new int[nums.length];

    //     int ans= 0;

    //     java.util.Arrays.fill(dp,-1);
        
    //     for(int i = 0;i < nums.length;i++){
    //         ans = Math.max(ans,1+helper(i,nums,dp));
    //     }

    //     return ans;
    // }
}