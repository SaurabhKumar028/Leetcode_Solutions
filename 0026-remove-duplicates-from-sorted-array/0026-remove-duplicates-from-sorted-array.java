class Solution {
    public int removeDuplicates(int[] nums) {
        
        HashSet<Integer> set = new LinkedHashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int i = 0;
        for (int num : set) {
            nums[i++] = num;
        }

        // MOST IMPORTANT PART -- > 

        // int min = nums.length-set.size();

        // return nums.length-min;

        return set.size();
    }
}