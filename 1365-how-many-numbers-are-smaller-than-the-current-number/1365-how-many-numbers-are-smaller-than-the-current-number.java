class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      int[] temp = new int[nums.length];

      

      for(int i = 0 ; i < nums.length;i++){
        int cout = 0;
        for(int j = 0;  j < nums.length;j++){
            if(nums[i] > nums[j]){
                cout++;
            }
            temp[i] = cout;
        }
      }  
      return temp;
    }
}