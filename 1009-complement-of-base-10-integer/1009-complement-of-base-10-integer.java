class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;

        int clue = 0;
        int temp = n;

        while(temp > 0){
            clue = (clue << 1) | 1;
            temp >>= 1;
        }
        return clue ^ n;
    }
}