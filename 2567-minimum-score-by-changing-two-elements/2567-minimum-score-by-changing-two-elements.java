class Solution {
    public int minimizeSum(int[] nums) {
        
        Arrays.sort(nums);

        

        if(nums.length < 4) return 0;

        int res1 =  nums[nums.length-1] - nums[2];
        int res2 = nums[nums.length-3] - nums[0];

        int res3 = nums[nums.length-2] - nums[1];

        return Math.min(res1,Math.min(res2,res3));
    }
}