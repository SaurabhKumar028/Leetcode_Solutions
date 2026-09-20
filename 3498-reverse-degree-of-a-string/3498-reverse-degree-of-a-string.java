class Solution {
    public int reverseDegree(String s) {
       
       int product = 0;

       for(int i = 0;i < s.length();i++){
        char c = s.charAt(i);

        int rev = 26 - (c-'a');
        int pos = i+1;

        product  += rev*pos;
       }
       return product;
        
    }
}