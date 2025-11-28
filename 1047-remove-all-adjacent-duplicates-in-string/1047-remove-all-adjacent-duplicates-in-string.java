class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length(); i++){
           char ch = s.charAt(i);

           if(!st.empty() && st.peek() == ch){
            st.pop();
           }
           else{
            st.push(ch);
           } 
        }
        while(!st.empty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}