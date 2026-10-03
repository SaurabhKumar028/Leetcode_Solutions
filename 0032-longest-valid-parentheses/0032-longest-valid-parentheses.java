class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int c1 = 0, c2 = 0;
        int max = 0;
        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                c1++;
            } else {
                c2++;
            }

            if (c1 == c2) {
                max = Math.max(max, c1 * 2);
            }
            if (c1 < c2) {
                c1 = 0;
                c2 = 0;
            }
        }

        c1 = 0;
        c2 = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                c1++;
            } else {
                c2++;
            }
            if (c1 == c2) {
                max = Math.max(max, c1 * 2);
            }
            if (c2 < c1) {
                c1 = 0;
                c2 = 0;
            }
        }
        return max;
    }
}