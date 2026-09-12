class Solution {
    HashMap<String,Integer>dp = new HashMap<>();
    int helper(int i,String s, HashMap<String,Integer> map,String temp){
        
        if(i== s.length()){
            if(temp.length() == 0){
                return 1;
            }
            return 0;
        }

        String key = Integer.toString(i) + "+" + temp;

        if(dp.containsKey(key)){
            return dp.get(key);
        }

        temp += s.charAt(i);
        
        int ans = 0;
        if(map.containsKey(temp)){
            int a = helper(i+1,s,map,"");

           if(a == 1){
            ans = 1;
           }
           
        }
            int a = helper(i+1,s,map,temp);
            if(a == 1){
                ans = 1;
            }
            dp.put(key,ans);
        return ans;

    }
    public boolean wordBreak(String s, List<String> wordDict) {
       HashMap<String,Integer> map = new HashMap<>();

       for(String p : wordDict){
        map.put(p,map.getOrDefault(p,0)+1);
       }
       if( helper(0,s,map,"") == 1) return true;

       return false;
    }
}