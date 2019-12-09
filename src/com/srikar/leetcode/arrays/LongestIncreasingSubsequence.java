package com.srikar.leetcode.arrays;

public class LongestIncreasingSubsequence {

	public int lengthOfLIS(int[] nums) {

		int max = 0;
		int[] subArray = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			subArray[i] = 1;
		}

		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j] && subArray[i] < subArray[j] + 1) {
					subArray[i] = subArray[j] + 1;
				}
			}
		}

		for (int i : subArray) {
			if (max < i) {
				max = i;
			}
		}

		return max;
	}
}
