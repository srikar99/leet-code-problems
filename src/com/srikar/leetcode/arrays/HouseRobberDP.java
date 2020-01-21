package com.srikar.leetcode.arrays;

public class HouseRobberDP {

	public int rob(int[] nums) {
		int[] memo = new int[nums.length + 1];
		
		memo[0] = 0;
		memo[1] = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			int val = nums[i];
			memo[i + 1] = Math.max(memo[i], val + memo[i - 1]);
		}
		
		return memo[nums.length];
	}

}
