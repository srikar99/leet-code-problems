package com.srikar.leetcode.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int[] A = {4, 1, 5, 2, 3, 6, 9, 8, 7};
		insertionSort.sort(A);
		
		for(int i : A) {
			System.out.print(i + " ");
		}
	}
	
	public void sort(int[] A) {
		int n = A.length;
		
		for(int i = 1; i < n; i++) {
			int key = A[i];
			int j = i - 1;
			
			while(j >= 0 && A[j] > key) {
				A[j+1] = A[j];
				j = j -1;
			}
			
			A[j + 1] = key;
		}
	}
}
