package com.srikar.leetcode.arrays;

/**
 * Given a matrix A, return the transpose of A.
 * 
 * The transpose of a matrix is the matrix flipped over it's main diagonal,
 * switching the row and column indices of the matrix.
 * 
 * 
 * @author shreekar.pujari
 *
 */
public class TransposeMatrix {
	public int[][] transpose(int[][] A) {

		if (A == null || A.length == 0) {
			return A;
		}

		int[][] B = new int[A[0].length][A.length];

		int r = A[0].length, c = A.length;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				B[i][j] = A[j][i];
			}
		}

		return B;
	}
}
