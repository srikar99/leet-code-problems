package com.srikar.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Example:
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 * 
 * @author shreekar.pujari
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 4 };
		int[] arr = twoSum(nums, 6);
		int[] nums1 = { 3, 2, 4 };
		int[] arr1 = twoSumHash(nums1, 6);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
	}

	// brute force approach
	private static int[] twoSum(int[] arr, int target) {

		int[] returnArray = new int[2];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					returnArray[0] = i;
					returnArray[1] = j;
				}
			}
		}
		return returnArray;
	}

	private static int[] twoSumHash(int[] A, int t) {

		int[] res = { -1, -1 };

		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < A.length; i++) {

			if(set.contains(A[i])) {
				res[1] = i;
			}
			
			set.add(t-A[i]);
		}
		
		for(int i = 0; i < A.length; i++) {
			if(t - A[res[1]] == A[i]) res[0] = i;
		}
		
		return res;
	}
}
