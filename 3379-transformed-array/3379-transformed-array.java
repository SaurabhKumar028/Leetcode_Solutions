class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int result [] = new int[nums.length];
        int n  = nums.length;
       for(int i = 0 ; i< nums.length ;i++){
        int newidx = (nums[i] + i) % n;

        if(newidx < 0){
            newidx += n;
        }
        result[i] = nums[newidx];
       }
       return result ;
    }
}