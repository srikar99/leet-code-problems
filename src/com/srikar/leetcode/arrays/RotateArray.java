package com.srikar.leetcode.arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6, 7 };
		int[] AA = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		rotate(A, k);
		rotateUsingReverse(AA, k);

		for (int a : A) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int a : AA) {
			System.out.print(a + " ");
		}
	}

	private static void rotate(int[] A, int k) {

		int[] B = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			B[(i + k) % A.length] = A[i];
		}

		for (int j = 0; j < A.length; j++) {
			A[j] = B[j];
		}
	}

	private static void rotateUsingReverse(int[] A, int k) {

		k = k % A.length;

		reverseArray(A, 0, A.length - 1);
		reverseArray(A, 0, k - 1);
		reverseArray(A, k, A.length - 1);

	}

	private static void reverseArray(int[] A, int start, int end) {

		while (start < end) {
			int temp = A[start];
			A[start] = A[end];
			A[end] = temp;
			start++;
			end--;
		}
	}
}
