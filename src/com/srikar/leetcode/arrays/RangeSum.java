package com.srikar.leetcode.arrays;

public class RangeSum {

	int[] A;

	public static void main(String[] args) {
		int i = new RangeSum(new int[] { -2, 0, 3, -5, 2, -1 }).sumRange(0, 2);
		System.out.println(i);
		
	}

	public RangeSum(int[] nums) {

		A = new int[nums.length + 1];

		for (int i = 0; i < nums.length; i++) {
			A[i + 1] = A[i] + nums[i];
		}
		
	}

	public int sumRange(int i, int j) {
		return A[j + 1] - A[i];
	}
}
