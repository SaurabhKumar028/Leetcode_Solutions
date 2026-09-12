class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,List<Integer>> map = new HashMap<>();

        int count = 0;

        for(int i = 0;i <nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        for(List<Integer> k : map.values()){
            if(k.size()<3) continue;

            int gap = k.get(1)-k.get(0);

            boolean s = true;

            for(int i = 2; i < k.size();i++){
                if(k.get(i)-k.get(i-1) != gap){
                s = false;
                break;
                }
            }
             if(s)count++;
        }
       return count;
    }
}