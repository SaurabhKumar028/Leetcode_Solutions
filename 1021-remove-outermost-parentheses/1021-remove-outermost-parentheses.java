class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        for(char ch : s.toCharArray()){
            
            if(ch == '('){
                if(sum > 0 ) sb.append(ch);
                sum++;
            }
            else{
                sum--;
                if(sum > 0){
                    sb.append(ch);
                }
            }

        }
        return sb.toString();
    }
}