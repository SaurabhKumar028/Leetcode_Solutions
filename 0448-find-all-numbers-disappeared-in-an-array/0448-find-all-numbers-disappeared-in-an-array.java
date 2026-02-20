class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ar = new ArrayList();
        int n = nums.length;
        HashSet<Integer> st = new HashSet<>();

        for(int num : nums){
            st.add(num);
        }
        for(int i = 1 ; i<= n ;i++){
            if(!st.contains(i)){
                ar.add(i);
            }
        }
        return ar;
    }
}