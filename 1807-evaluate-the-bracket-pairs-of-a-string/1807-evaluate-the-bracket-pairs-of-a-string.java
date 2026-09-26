class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        
        HashMap<String,String> map = new HashMap<>();

        for (List<String> p : knowledge) {
            map.put(p.get(0), p.get(1));
        }

        String temp = "";
        String res = "";

        for(int i = 0; i< s.length();i++){
            
            if(s.charAt(i) == '('){
                i++;
                while( s.charAt(i) != ')'){
                    temp += s.charAt(i);
                    i++;
                }
                if (map.containsKey(temp)) {
                res +=  map.get(temp);
                }else{
                    res += "?";
                }

                temp = "";
            }
            else{
                res += s.charAt(i);
            }
            
        }
        return res;
    }
}