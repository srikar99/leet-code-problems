package com.srikar.leetcode.twod.arrays;

public class FlippingAnImage {

	public static void main(String[] args) {
		int[][] A = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		flipAndInvertImage(A);
	}

	public static int[][] flipAndInvertImage(int[][] A) {
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
