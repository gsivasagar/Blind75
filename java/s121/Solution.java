package Java.s121;

class Solution {
    public int maxProfit(int[] prices) {
        int yesterday = prices[0], maxProfit = 0, n = prices.length;
        for (int today = 1; today < n; today++) {
            int profit = prices[today] - yesterday;
            if (maxProfit < profit) {
                maxProfit = profit;
            }
            if (profit < 0) {
                yesterday = prices[today];
            }
        }
        return maxProfit;
    }
}
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Time:- O(n), Space:- O(1).