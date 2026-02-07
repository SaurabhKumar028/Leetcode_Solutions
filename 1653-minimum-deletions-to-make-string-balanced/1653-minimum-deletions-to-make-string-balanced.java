class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st = new Stack<>();

        char [] arr = s.toCharArray();
        int count = 0 ;
        
        for(int i = 0 ; i< arr.length ; i++){
            if(!st.isEmpty() && st.peek() == 'b' && arr[i] == 'a'){
                st.pop();
                count++;
            }
            else{
                st.push(arr[i]);
            }
        }
        return count;
        
    }
}