class Solution {
    void suffix(int[] nums, int[] suff) {
        int min = Integer.MAX_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            suff[i] = min;
        }
    }

    void prefix(int[] nums, int[] pre) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            pre[i] = max;
        }
    }

    public int firstStableIndex(int[] nums, int k) {

        int[] pre = new int[nums.length];
        int[] suff = new int[nums.length];

        prefix(nums, pre);
        suffix(nums, suff);

        for (int i = 0; i < nums.length; i++) {
            if (pre[i] - suff[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}