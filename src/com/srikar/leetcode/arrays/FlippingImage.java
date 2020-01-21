package com.srikar.leetcode.arrays;

/**
 * Given a binary matrix A, we want to flip the image horizontally, then invert
 * it, and return the resulting image.
 * 
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * 
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced
 * by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 * 
 * Example 1:
 * 
 * Input: [[1,1,0],[1,0,1],[0,0,0]] Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]]. Then, invert
 * the image: [[1,0,0],[0,1,0],[1,1,1]]
 * 
 * @author shreekar.pujari
 *
 */
public class FlippingImage {

	public int[][] flipAndInvertImage(int[][] A) {
		int rows = A[0].length;
		int start = 0, end = rows - 1;

		for (int i = 0; i < A.length; i++) {
			while (start < end) {
				int temp = A[i][start];
				A[i][start] = A[i][end];
				A[i][end] = temp;
				start++;
				end--;
			}

			start = 0;
			end = rows - 1;
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < rows; j++) {
				A[i][j] = A[i][j] ^ 1;
			}
		}

		return A;
	}
}
