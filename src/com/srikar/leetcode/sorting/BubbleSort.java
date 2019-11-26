package com.srikar.leetcode.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] A = {4, 1, 5, 2, 3, 6, 9, 8, 7};
		int length = A.length;
		
		bubbleSort.bubbleSort(A, length);
		
		for(int i : A) {
			System.out.print(i + " ");
		}
	}
	
	public void bubbleSort(int[] A, int length) {
		
		for(int i = 0; i < length - 1; i++) {
			for(int j = 0; j < length - 1; j++) {
				if(A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}
		}
	}
}
