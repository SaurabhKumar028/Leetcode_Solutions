import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int curr = 1 ;
        int max = 1 ;
        if (nums.length == 0) return 0;
        for(int i = 0 ; i < nums.length -1;i++){
            if(nums[i+1] - nums[i] == 1){
                curr++;

            }
            else if ( nums[i+1] - nums[i] == 0){
                continue;
            }
            else{
                curr = 1;
            }
             max = Math.max(max , curr);
        }
        return max;
    }
}