package com.srikar.leetcode.arrays;

public class MaxContigousSubArray {

	public static void main(String[] args) {
		int[] A = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int[] B = {-1, -2, -3};
		int length = A.length;

		System.out.println(maxSubArray(A, length));
		System.out.println(maxSubArrayAccurateCode(B));
	}

	private static int maxSubArray(int[] A, int length) {
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < length; i++) {
			max_ending_here = max_ending_here + A[i];
			if (max_ending_here < 0) {
				max_ending_here = 0;
			}
			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
		}
		return max_so_far;
	}

	private static int maxSubArrayAccurateCode(int[] nums) {
		int max_so_far = nums[0], max_till_here = nums[0];

		for (int i = 1; i < nums.length; i++) {
			max_till_here = Math.max(nums[i], max_till_here + nums[i]);
			max_so_far = Math.max(max_so_far, max_till_here);
		}

		return max_so_far;
	}
}
