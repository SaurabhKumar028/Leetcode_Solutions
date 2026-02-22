class Solution {
    public int binaryGap(int n) {
        
        String result = Integer.toBinaryString(n);
        
        int count = -1;
        int max = 0;
        for(int i = 0 ; i < result.length(); i++){
            if(result.charAt(i) == '1'){
                  if( count != -1){
                    max = Math.max(max , i - count);
                  }
                 count = i;
            }
        }
         return max;
    }
}