class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==4)return true;
        if (num == 1) return true;
        for(int i = 2 ; i <= num/3; i++){
            int pdt = i * i;
            if(pdt == num) return true;
        }
        return false;
    }
}