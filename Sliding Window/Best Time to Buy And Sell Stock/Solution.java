class Solution {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        int minp = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            minp = Math.min(minp, prices[i]);
            profit = Math.max(profit, prices[i]-minp);
        }
        return profit;
    }
}