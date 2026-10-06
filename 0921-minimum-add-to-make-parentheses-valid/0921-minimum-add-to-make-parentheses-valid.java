class Solution {
    public int minAddToMakeValid(String s) {
       Stack<Character> st = new Stack<>();
        int count = 0;
       for(char ch : s.toCharArray()){
        if(st.size() != 0 && ch == ')'){
            st.pop();
        }
        else if(st.size()== 0 && ch == ')'){
            count++;
        }
        else{
            st.push(ch);
        }
       }
       return count + st.size(); 
    }
}