class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int cost = 0;
        int hg = nums[nums.length-1];

        for(int i = nums.length-1;i >= 0 ; i--){
            int rem = hg - nums[i];
            cost += rem;
        }
        return cost;
    }
}