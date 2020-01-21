package com.srikar.leetcode.arrays;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		BestTimetoBuyandSellStock bestTimetoBuyandSellStock = new BestTimetoBuyandSellStock();
		int[] prices = {7,1,5,3,6,4};
		
		int profit = bestTimetoBuyandSellStock.maxProfit(prices);
		
		System.out.println(profit);
	}

	public int maxProfit(int[] prices) {

		if(prices == null || prices.length == 0) {
            return 0;
        }
        
        int minprice = Integer.MAX_VALUE;
        int max_profit = 0;
        
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minprice) {
                minprice = prices[i];
            } else if(prices[i] - minprice > max_profit) {
                max_profit = prices[i] - minprice;
            }
        }
        
        return max_profit;
	}
}
