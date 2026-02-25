class Solution {
    public int[] sortByBits(int[] arr) {

        int n = arr.length;
        int[] temp = new int[n];
        Arrays.sort(arr);
        int index = 0;  

        for (int bit = 0; bit <= 32; bit++) {

            for (int i = 0; i < n; i++) {

                if (Integer.bitCount(arr[i]) == bit) {
                    temp[index] = arr[i];
                    index++;   
                }
            }
        }

        return temp;
    }
}