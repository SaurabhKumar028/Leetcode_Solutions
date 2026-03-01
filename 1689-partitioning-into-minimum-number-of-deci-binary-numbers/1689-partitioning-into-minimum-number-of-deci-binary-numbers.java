class Solution {
    public int minPartitions(String n) {
        int maxdigit = 0;

        for(char c: n.toCharArray()){
            maxdigit = Math.max(maxdigit , c-'0');

            if(maxdigit == 9) return 9;
        }
        return maxdigit;
    }
}