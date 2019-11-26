package com.srikar.leetcode.sorting;

public class QuickSort {

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		int[] A = {4, 1, 5, 2, 3, 6, 9, 8, 7};
		int l = 0, h = A.length - 1;
		
		quickSort.sort(A, l, h);
		
		for(int i : A) {
			System.out.print(i + " ");
		}
	}

	public void sort(int[] A, int l, int h) {

		if (l < h) {
			int p = partition(A, l, h);

			sort(A, l, p - 1);
			sort(A, p + 1, h);
		}
	}

	private int partition(int[] A, int l, int h) {
		
		int p = A[h];
		int i = (l - 1);
		
		for(int j = l; j < h; j++) {
			
			if(A[j] < p) {
				i++;
				
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		
		int t = A[i + 1];
		A[i + 1] = A[h];
		A[h] = t;
		
		return i + 1;
	}
}
