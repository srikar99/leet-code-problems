package com.srikar.leetcode.arrays;

public class MaximumProductArray {

	public static void main(String[] args) {

	}

	public int maxProduct(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}

		int max_prod = 1, min_prod = 1, max_so_far = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 0) {
				max_prod = Math.max(max_prod * nums[i], nums[i]);
				min_prod = Math.min(min_prod * nums[i], nums[i]);
			} else {
				int temp = max_prod;
				max_prod = Math.max(min_prod * nums[i], nums[i]);
				min_prod = Math.min(temp * nums[i], nums[i]);
			}

			if (max_so_far < max_prod) {
				max_so_far = max_prod;
			}
		}

		return max_so_far;
	}
}
