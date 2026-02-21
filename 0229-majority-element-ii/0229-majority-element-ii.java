class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        
        int target = n /3;
        HashMap<Integer,Integer> st = new HashMap<>();
        ArrayList<Integer> ar = new ArrayList<>();

        for(int num : nums){
            st.put(num , st.getOrDefault(num , 0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : st.entrySet()){
            if(entry.getValue() > target){
                ar.add(entry.getKey());
            }
        }
        return ar;
    }
}