class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (min > nums[i]) {
                min = nums[i];
                minIndex = i;
            }

            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }

        int c1 = Math.max(minIndex, maxIndex) + 1;

        int c2 = n - Math.min(minIndex, maxIndex);

        int c3 = Math.min(minIndex, maxIndex) + 1
               + n - Math.max(minIndex, maxIndex);

        return Math.min(c1, Math.min(c2, c3));
    }
}