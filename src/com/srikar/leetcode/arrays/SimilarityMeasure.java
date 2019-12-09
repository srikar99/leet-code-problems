package com.srikar.leetcode.arrays;

public class SimilarityMeasure {

	public static void main(String[] args) {
		
		int[] arr = { 1, 1, 2, 1, 2 };
		int[][] indices = { { 2, 3 }, { 3, 4 }, { 2, 4 }, { 3, 5 }, { 1, 5 } };
		
		for(int i = 0; i < indices.length; i++) {
			System.out.println(similiarity(arr, indices[i]));
		}

	}
	
	public static int similiarity(int[] arr, int[] indices) {
		
		int L = indices[0], R = indices[1];
		int result = 0;
		
		if(arr[L] == arr[R]) {
			result = Math.abs(R - L);
		}
		
		for(int i = 0; i < arr.length; i++) {
			
		}
		
		return result;
	}
}
