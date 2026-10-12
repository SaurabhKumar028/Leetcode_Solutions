import java.util.*;
class Solution {
    public int maxSum(List<Integer> nums, int k) {
        
        final int MOD = 1000000007;

        int[] bit = new int[32];

        for(int num : nums){
            for(int b = 0; b<32; b++){
                if((num &  (1 << b)) != 0){
                    bit[b]++;
                }
            }
        }
        long ans = 0;
        
        for(int i = 0; i < k; i++){
            
            long num = 0;

            for(int b = 31; b >= 0; b--){

                if(bit[b] > 0){
                    num |= (1L << b);
                    bit[b]--;
                }
                
            }
            ans = (ans + num *num) % MOD;
        }
       
        return (int) ans;
        
    }
}