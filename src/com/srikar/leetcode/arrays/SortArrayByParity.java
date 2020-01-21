package com.srikar.leetcode.arrays;

/**
 * Given an array A of non-negative integers, return an array consisting of all
 * the even elements of A, followed by all the odd elements of A.
 * 
 * You may return any answer array that satisfies this condition.
 * 
 * @author shreekar.pujari
 *
 */
public class SortArrayByParity {

	public int[] sortArrayByParity(int[] A) {

		int[] a = new int[A.length];
		int t = 0;
		for (int i = 0; i < A.length; i++) {
			if ((A[i] & 1) == 0) {
				a[t++] = A[i];
			}
		}
		for (int i = 0; i < A.length; i++) {
			if ((A[i] & 1) == 1) {
				a[t++] = A[i];
			}
		}

		return a;
	}
}
