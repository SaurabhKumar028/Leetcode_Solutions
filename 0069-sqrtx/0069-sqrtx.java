class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        if(x < 2) return x;

        while(left <= right){
        
            int mid = left + (right -left)/2;

           if(mid <= x/mid){
            left = mid +1;
           }
           else{
            right = mid -1;
           }
        }
        return right;
    }
}