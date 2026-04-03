package Arrays;

/*
 * Problem: Best Time to Buy and Sell Stock
 * Platform: LeetCode
 * Description: Find the maximum profit by choosing one day to buy a stock
 *              and a different future day to sell it.
 * Approach: Brute-force approach using nested loops to check all possible
 *           buy and sell pairs, then store and print the maximum profit.
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 * Difficulty: Easy
 */

import java.util.ArrayList;
import java.util.Collections;

public class BestTimetoBuystock {
    public static void main(String[] args) {
        BestTimetoBuystock obj = new BestTimetoBuystock();
        obj.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }

    public void maxProfit(int[] prices) {
        //1. Not an Optimized approach
        ArrayList<Integer> profit = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = prices.length - 1; j > i; j--) {
                if (prices[i] < prices[j]) {
                    if (prices[j] - prices[i] > temp) {
                        temp = prices[j] - prices[i];
                    }
                }
            }
            if (temp > 0) {
                profit.add(temp);
                temp = 0;
            }
        }
        profit.sort(Collections.reverseOrder());
        if (!profit.isEmpty()) {
            System.out.println(profit);
        } else {
            System.out.println("No transactions are done and the max profit = 0.");
        }
    }
}
