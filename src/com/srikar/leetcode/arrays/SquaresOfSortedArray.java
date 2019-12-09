package com.srikar.leetcode.arrays;

/**
 * Given an array of integers A sorted in non-decreasing order, return an array
 * of the squares of each number, also in sorted non-decreasing order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: [-4,-1,0,3,10] Output: [0,1,9,16,100]
 * 
 * @author shreekar.pujari
 *
 */
public class SquaresOfSortedArray {

	public int[] sortedSquares(int[] A) {

		int[] result = new int[A.length];
		int length = A.length;

		for (int i = 0; i < A.length; i++) {
			result[i] = A[i] * A[i];
		}

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - 1; j++) {
				if (result[j] > result[j + 1]) {
					int temp = result[j];
					result[j] = result[j + 1];
					result[j + 1] = temp;
				}
			}
		}

		return result;
	}
}
