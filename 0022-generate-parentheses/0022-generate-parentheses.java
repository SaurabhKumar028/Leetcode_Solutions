class Solution {
     ArrayList<String> ans = new ArrayList<>();
    void generate(String temp , int n , int count1,int count2){
        if(count2> count1)return;

        if(count1 > (n/2) || count2 > (n/2))return;

        if(temp.length() == n){
            ans.add(temp);
            return;
        }
        generate(temp+"(",n,count1+1,count2);
        generate(temp+")",n,count1,count2+1);
    }
    public List<String> generateParenthesis(int n) {
        
        String temp ="";
        generate(temp,n*2,0,0);
        return ans;
    }
}