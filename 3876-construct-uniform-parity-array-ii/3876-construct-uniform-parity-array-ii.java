class Solution {
    public boolean uniformArray(int[] nums) {
        int m = 1000000000;
        int f = 0;

        for (int a : nums) {
            if (a % 2 != 0) {
                m = Math.min(m, a);
                f = 1;
            }
        }

        if (f == 0) return true;

        for (int a : nums) {
            if (a % 2 == 0 && m > a) {
                return false;
            }
        }

        return true;
    }
}