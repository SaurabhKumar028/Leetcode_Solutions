class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        HashSet<String> st = new HashSet<>();

        for(int i = 0 ; i <= n -k ;i++){
            st.add(s.substring(i , i+k));
        }
        int length = 1 << k ;
        if (st.size() == length) return true;

        return false;
    }
}