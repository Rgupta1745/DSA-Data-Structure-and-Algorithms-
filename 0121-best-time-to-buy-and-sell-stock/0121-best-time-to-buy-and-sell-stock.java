class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentBuy = prices[0];
        for(int i =1 ; i<prices.length ; i++){
            currentBuy = Math.min(currentBuy,prices[i] );
            int p = Math.max(currentBuy , prices[i]) - Math.min(currentBuy , prices[i] );
            maxProfit = Math.max( p, maxProfit);
        }
        return maxProfit;
    }
}