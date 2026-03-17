class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        
        int sum = 0;
        

        for(int i = 1 ; i < timeSeries.length;i++){
            int diff = timeSeries[i] - timeSeries[i-1];

            if(duration <= diff){
                sum += duration;
            }
            else{
                sum += diff;
            }
        }
        return sum+duration;
    }
}