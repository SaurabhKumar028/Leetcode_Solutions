class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        int l = 0;
        int r = s.length()-1;

     
        
        char [] arr = s.toCharArray();

        while(l < r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
       String str = new String(arr);
       if(s.equals(str)){
        return true;
       }
       else return false;
    }
}