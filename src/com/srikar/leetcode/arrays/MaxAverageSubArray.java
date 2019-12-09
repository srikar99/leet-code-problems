package com.srikar.leetcode.arrays;

public class MaxAverageSubArray {

	public static void main(String[] args) {
		int[] nums = { 0, 4, 0, 3, 2 };
		int k = 1;

		System.out.println(maxAverage(nums, k));
	}

	private static double maxAverage(int[] nums, int k) {
		double ma = Double.MIN_VALUE;
		double sum = 0;
		int x = nums.length - (nums.length - k);
		int y = nums.length - k + 1;
		for (int j = 0; j < y; j++) {
			for (int i = j; i < j + x && i < nums.length; i++) {
				sum += nums[i];
			}

			double avg = sum / k;
			if (ma < avg) {
				ma = avg;
			}
			sum = 0;
		}

		return ma;
	}
}
