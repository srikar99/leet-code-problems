package com.srikar.leetcode.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int[] A = {4, 1, 5, 2, 3, 6, 9, 8, 7};
		selectionSort.sort(A);
		
		for(int i : A) {
			System.out.print(i + " ");
		}
	}
	
	public void sort(int[] A) {
		
		int n = A.length;
		
		for(int i = 0; i < A.length; i++) {
			int min_index = i;
			
			for(int j = i + 1; j < n; j++) {
				if(A[j] < A[min_index]) {
					min_index = j;
				}
			}
			
			int temp = A[min_index];
			A[min_index] = A[i];
			A[i] = temp;
		}
	}
}
