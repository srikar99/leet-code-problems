package com.srikar.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 1};
		int[] nums1 = {1, 2, 3, 4};
		
		System.out.println("Duplicates: " + hasDuplicatesBruteForce(nums));
		System.out.println("Non Duplicates: " + hasDuplicatesBruteForce(nums1));
		
		System.out.println("Duplicates: " + hasDuplicatesHashing(nums));
		System.out.println("Non Duplicates: " + hasDuplicatesHashing(nums1));
		}

	private static boolean hasDuplicatesBruteForce(int[] nums) {
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[j] == nums[i]) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean hasDuplicatesHashing(int[] nums) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
		}

		return false;
	}
}
