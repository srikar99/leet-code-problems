package com.srikar.leetcode.sorting;

public class MergeSort {

	public static void main(String[] args) {

		MergeSort ms = new MergeSort();
		int[] A = { 5, 2, 4, 6, 1, 3 };
		
		int l = 0, h = A.length - 1;
		
		ms.sort(A, l, h);
		
		for(int i : A) {
			System.out.print(i + " ");
		}
	}

	public void sort(int[] A, int l, int h) {

		if (l < h) {
			int mid = (l + h) / 2;

			sort(A, l, mid);
			sort(A, mid + 1, h);

			merge(A, l, mid, h);
		}
	}

	private void merge(int[] A, int l, int m, int h) {
		int n1 = m - l + 1;
		int n2 = h - m;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = A[l + i];
		}

		for (int i = 0; i < n2; i++) {
			R[i] = A[m + 1 + i];
		}

		int i = 0, j = 0;
		int k = l;

		while (i < n1 && j < n2) {

			if (L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			} else {
				A[k] = R[j];
				j++;
			}

			k++;
		}

		while (i < n1) {
			A[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			A[k] = R[j];
			j++;
			k++;
		}
	}
}
