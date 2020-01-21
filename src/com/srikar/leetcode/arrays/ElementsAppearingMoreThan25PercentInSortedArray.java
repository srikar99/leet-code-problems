package com.srikar.leetcode.arrays;

/**
 * Given an integer array sorted in non-decreasing order, there is exactly one
 * integer in the array that occurs more than 25% of the time.
 * 
 * Return that integer.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: arr = [1,2,2,6,6,6,6,7,10] Output: 6
 * 
 * @author shreekar.pujari
 *
 */
public class ElementsAppearingMoreThan25PercentInSortedArray {

	public int findSpecialInteger(int[] arr) {

		int n = arr.length / 4;
		int[] a = new int[100000];

		for (int i = 0; i < arr.length; i++) {
			a[arr[i]]++;
			if (a[arr[i]] > n) {
				return arr[i];
			}
		}

		return -1;
	}
}
