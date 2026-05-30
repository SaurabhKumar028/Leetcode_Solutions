class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int leftMax = 0 , rightMax = 0 , l = 0;
        int r = n-1;
        int sum = 0;

        while(l < r){
            if(arr[l] <= arr[r] ){
                
                if(leftMax >= arr[l]){
                    sum += leftMax - arr[l];
                }
                else{
                    leftMax = arr[l];
                }
                l++;
            }
            else{
                if(rightMax > arr[r]){
                    sum += rightMax - arr[r];
                }
                else{
                    rightMax = arr[r];
                }
                r--;
            }
        }
         return sum;
    }
}