import java.util.Arrays;
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
         
         Arrays.sort(nums);
         int n = nums.length;

         for(int i = n-1 ;  i>= 0 ; i--){
            if(arr.isEmpty() || arr.get(arr.size() - 1) != nums[i]){
                arr.add(nums[i]);
            }
            if(arr.size() == k) break;
         }
            int[] res = new int[arr.size()];
                for (int i = 0; i < arr.size(); i++) {
                    res[i] = arr.get(i);
                }
                return res;
    }
}