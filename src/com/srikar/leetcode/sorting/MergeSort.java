package com.srikar.leetcode.sorting;

public class MergeSort {

	
	public void sort(int[] A, int l, int h) {
		
		if(l < h) {
			int mid = (l + h) / 2;
			
			sort(A, l, mid);
			sort(A, mid + 1, h);
			
			merge(A, l, mid, h);
		}
	}
	
	private void merge(int[] A, int l, int m, int h) {
		
	}
}
