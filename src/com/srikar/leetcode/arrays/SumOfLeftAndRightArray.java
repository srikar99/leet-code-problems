package com.srikar.leetcode.arrays;

public class SumOfLeftAndRightArray {

	public static void main(String[] args) {
		int[] a = { 1, 4, 2, 5 };
		System.out.println(findElement(a));
		System.out.println(findElement(a, a.length));
	}

	// approach 2
	private static int findElement(int[] a, int n) {
		// Forming prefix sum array from 0
		int[] prefixSum = new int[n];
		prefixSum[0] = a[0];
		for (int i = 1; i < n; i++)
			prefixSum[i] = prefixSum[i - 1] + a[i];

		// Forming suffix sum array from n-1
		int[] suffixSum = new int[n];
		suffixSum[n - 1] = a[n - 1];
		for (int i = n - 2; i >= 0; i--)
			suffixSum[i] = suffixSum[i + 1] + a[i];

		// Find the point where prefix and suffix
		// sums are same.
		for (int i = 1; i < n - 1; i++)
			if (prefixSum[i] == suffixSum[i])
				return a[i];

		return -1;
	}

	// approach 3
	private static int findElement(int[] a) {

		int right_sum = 0, left_sum = 0;
		int size = a.length;

		// Computing right_sum
		for (int i = 1; i < size; i++)
			right_sum += a[i];

		// Checking the point of partition
		// i.e. left_Sum == right_sum
		for (int i = 0, j = 1; j < size; i++, j++) {
			right_sum -= a[j];
			left_sum += a[i];

			if (left_sum == right_sum)
				return a[i + 1];
		}

		return -1;
	}
}
