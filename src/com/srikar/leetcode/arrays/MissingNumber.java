package com.srikar.leetcode.arrays;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
 * the one that is missing from the array.
 * 
 * @author shreekar.pujari
 *
 */
public class MissingNumber {

	public static void main(String[] args) {
		int[] A = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int number = findMissingNumber(A);
		System.out.println(number);
	}

	// using gauss theorem
	private static int findMissingNumber(int[] A) {

		int total = A.length * (A.length + 1) / 2;
		int sum = 0;

		for (int i : A) {
			sum += i;
		}
		
		return total - sum;
	}
}
