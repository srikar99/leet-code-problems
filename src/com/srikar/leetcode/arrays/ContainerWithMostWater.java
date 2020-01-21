package com.srikar.leetcode.arrays;

/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with
 * x-axis forms a container, such that the container contains the most water.
 * 
 * Note: You may not slant the container and n is at least 2.

 * @author shreekar.pujari
 *
 */
public class ContainerWithMostWater {

	public int maxArea(int[] A) {
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
