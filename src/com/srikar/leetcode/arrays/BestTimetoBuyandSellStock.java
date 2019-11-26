package com.srikar.leetcode.arrays;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		BestTimetoBuyandSellStock bestTimetoBuyandSellStock = new BestTimetoBuyandSellStock();
		int[] prices = {7,1,5,3,6,4};
		
		int profit = bestTimetoBuyandSellStock.maxProfit(prices);
		
		System.out.println(profit);
	}

	public int maxProfit(int[] prices) {

		if (prices == null || prices.length == 0) {
			return 0;
		}

		int idx = Integer.MAX_VALUE, min_value = 0;
		int buy = 0, sell = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < idx) {
				idx = prices[i];
				buy = i;
			}
		}

		for (int j = buy; j < prices.length - 1; j++) {
			if (prices[j] > idx) {
				if (prices[j] > sell) {
					sell = prices[j];
					min_value = j;
				}
			}
		}

		if (min_value < buy) {
			return 0;
		} else {
			return prices[min_value] - prices[buy];
		}
	}
}
