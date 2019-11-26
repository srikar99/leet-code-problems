package com.srikar.leetcode.lists;

public class IntervalListIntersection {

	public static void main(String[] args) {
		IntervalListIntersection intersection = new IntervalListIntersection();

		/*
		 * int[][] A = { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } }, B = { { 1, 5 },
		 * { 8, 12 }, { 15, 24 }, { 25, 26 } };
		 */

		int[][] A = { { 5, 10 } }, B = { { 3, 10 } };

		intersection.intervalIntersection(A, B);
	}

	public int[][] intervalIntersection(int[][] A, int[][] B) {

		if (A == null || B == null || A.length == 0 || B.length == 0) {
			return new int[0][0];
		}

		int[][] result = new int[2 * 1000][A[0].length];
		int[] temp = new int[A[0].length];

		int aStart = 0, aEnd = 0, bStart = 0, bEnd = 0, x = 0;

		for (int j = 0; j < B.length; j++) {
			for (int i = 0; i < A.length; i++) {
				aStart = A[i][0];
				aEnd = A[i][1];
				bStart = B[j][0];
				bEnd = B[j][1];

				if (aStart > bEnd) {
					break;
				}

				if (aEnd < bStart) {
					continue;
				}
				if (aEnd <= bEnd) {
					if (aStart > bStart) {
						temp[0] = aStart;
						temp[1] = aEnd;
						result[x] = temp;
						x++;
						temp = new int[A[0].length];
					} else {
						temp[0] = bStart;
						temp[1] = aEnd;
						result[x] = temp;
						x++;
						temp = new int[A[0].length];
					}
				} else if (aStart == bEnd) {
					temp[0] = aStart;
					temp[1] = bEnd;
					result[x] = temp;
					x++;
					temp = new int[A[0].length];
				} else if (aEnd > bEnd) {
					if (aStart < bStart) {
						temp[0] = bStart;
						temp[1] = bEnd;
						result[x] = temp;
						x++;
						temp = new int[A[0].length];
					} else {
						temp[0] = aStart;
						temp[1] = bEnd;
						result[x] = temp;
						x++;
						temp = new int[A[0].length];
					}
				}
			}
		}
		
		int[][] r = new int[x][A[0].length];
		
		for (int k = 0; k < x; k++) {
			r[k] = result[k];
		}
		
		return r;
	}
}
