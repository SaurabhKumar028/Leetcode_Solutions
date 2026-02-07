
class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n = nums.length;
        int s = n/2;
        int [] arr1 = new int[s];
        int [] arr2 = new int[s];
        int a1 = 0 ; 
        int a2 = 0;

        for(int num : nums){
            if(num > 0){
                arr1[a1++] = num;
            }
            else{
                arr2[a2++] = num;
            }
        }


        int [] result = new int[n];
        int idx = 0;
        for(int i = 0 ; i< s ; i++){
            result[idx++] = arr1[i];
            result[idx++] = arr2[i];
        }
           return result; 
        }
    }
