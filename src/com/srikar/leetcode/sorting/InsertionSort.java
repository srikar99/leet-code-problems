package com.srikar.leetcode.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int[] A = { 5, 2, 4, 6, 1, 3 };
		insertionSort.sort(A);

		for (int i : A) {
			System.out.print(i + " ");
		}
	}

	public void sort(int[] A) {
		int n = A.length;

		for (int i = 1; i < n; i++) {
			int key = A[i];
			int j = i - 1;

			while (j >= 0 && A[j] > key) {
				A[j + 1] = A[j];
				j = j - 1;
			}

			A[j + 1] = key;
		}
	}
}
