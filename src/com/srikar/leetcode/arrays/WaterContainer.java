package com.srikar.leetcode.arrays;

public class WaterContainer {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(arr));
	}

	public static int maxArea(int[] A) {
		int l = 0;
		int r = A.length - 1;
		int area = 0;

		while (l < r) {
			// Calculating the max area
			area = Math.max(area, Math.min(A[l], A[r]) * (r - l));

			if (A[l] < A[r]) {
				l += 1;
			} else {
				r -= 1;
			}
		}
		return area;
	}

}
