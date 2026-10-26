class Solution { 
    
    public long countSubarrays(int[] nums, int nK, int xK) {

        int count = 0;
        long ans = 0;

        for(int i = 0; i < nums.length;i++){
            if(nums[i] >= nK && nums[i] <= xK){
                count++;

                ans += count;
            }
            else{
                count = 0;
                
            }
        }
        return ans;
    }
}