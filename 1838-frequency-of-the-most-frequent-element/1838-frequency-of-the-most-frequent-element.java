import java.util.*;

class Solution {
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        long cost = 0;    
        int count = 1;     
        int max = 1;
        int left = 0;

        for (int right = 1; right < nums.length; right++) {

          
            cost += (long)(nums[right] - nums[right - 1]) * (right - left);

          
            while (cost > k) {
                cost -= nums[right] - nums[left];
                left++;
                count--;
            }

            count++;
            max = Math.max(max, count);
        }

        return max;
    }
}
