class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;

        int b = 0;
        int s = 1;

        while(s<prices.length){
            maxP = Math.max(maxP, prices[s]- prices[b]);
            if(prices[s]<=prices[b]){
               b=s;
            }
            s++;
        }
        return maxP;
    }
}
