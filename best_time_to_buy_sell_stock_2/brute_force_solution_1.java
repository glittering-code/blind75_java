/// brute force solution
// time complexity = O(n^2)
// space complexity = O(1)
// this solution is techinally correct but does not work for large testcases because of time complexity. Hence we need to optimize time complexity. 
class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        for(int i = 0 ; i < prices.length-1 ; ++i) {
            for(int j = i+1 ; j < prices.length ; ++j) {
                int profit = prices[j]-prices[i];
                max_profit = Math.max(max_profit,profit);
            }
        }

        return max_profit;
    }
}
