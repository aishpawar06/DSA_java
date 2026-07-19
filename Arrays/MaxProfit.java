/*
    Problem: Best Time to Buy and Sell Stock
    Platform: LeetCode 121
    Level: Easy
    Approach: Track minimum price so far and calculate max profit greedily
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
package Arrays;
public class MaxProfit {

    public static int maxProfit(int[] prices) {
        int minTillDate = prices[0];
        int maxProfit = 0;
        for(int i = 0 ; i < prices.length ; i++){
            int currentProfit = prices[i] - minTillDate;
            maxProfit = Integer.max(maxProfit,currentProfit);
            minTillDate = Integer.min(minTillDate,prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}
