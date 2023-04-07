// problem link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// solution link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/928972761/
/* logic - We need to know the maximum element towards the right of every element
Hence we will create an array which will have maximum element towards right of it.
substract every element of this new array from prices array and find the maximum among it

*/ 
// time complexity = O(n)
// space complexity = O(n)
class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
      // array to store maximum towards right of every price element
        int [] arr = new int[prices.length];
      // since there is nothing towards right of last element. hence last element of this array will be 0
        arr[prices.length-1] = 0; 
        int rmax = prices[prices.length-1];
      // start iterating from end and keep finding maximum
        for(int j = prices.length-2 ; j >= 0 ; --j) {
            arr[j] = rmax;
            rmax = Math.max(rmax,prices[j]);
        }  
      // subtract each element of prices and arr and find the maximum.
        for(int i = 0 ; i < prices.length ; ++i) {
            int output = arr[i] - prices[i];
            if(max_profit < output) {
                max_profit = output;
            }
        }
        return max_profit;
    }
}
