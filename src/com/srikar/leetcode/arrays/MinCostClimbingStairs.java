package com.srikar.leetcode.arrays;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		MinCostClimbingStairs climbingStairs = new MinCostClimbingStairs();
		int[] cost = {10, 15, 20};
		System.out.println(climbingStairs.mincostDP(cost));
	}
	
	public int mincostDP(int[] cost) {
		 int a = cost[0], b = cost[1];
	        
	        for(int i = 2; i < cost.length; i++) {
	            int c = cost[i] + Math.min(a,b);
	            a = b;
	            b = c;
	        }
	        
	        return Math.min(a, b);
	}
}
