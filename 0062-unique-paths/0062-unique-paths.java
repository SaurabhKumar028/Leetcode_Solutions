
class Solution {
        int factorial(int m,int n){
            int N = (m-1)+(n-1);

            int option = Math.min(m-1,n-1);

            long ans = 1;

            for(int i =1;i <= option;i++){
                ans = ans*(N - option +i)/i;
            }
            return (int)ans;
            
        }
     public int uniquePaths(int m, int n){
            return factorial(m,n);
     }
    // int helper(int m,int n,int i, int j){
    //     if(i>= m)return 0;
    //     if(j>= n)return 0;

    //     if(i== m-1&& j == n-1)return 1;

    //     int c1 = helper(m,n,i+1,j);
    //     int c2 = helper(m,n,i,j+1);
    //     return c1+c2;
    // }
    // public int uniquePaths(int m, int n) {
    //     return helper(m,n,0,0);
    // }
}