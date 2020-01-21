package com.srikar.leetcode.arrays;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this
 * array.
 * 
 * Example 1: Input: [1,1,0,1,1,1] Output: 3 Explanation: The first two digits
 * or the last three digits are consecutive 1s. The maximum number of
 * consecutive 1s is 3.
 * 
 * @author shreekar.pujari
 *
 */
public class MaxNumberOfOnes {

	public int findMaxConsecutiveOnes(int[] nums) {

		int count = 0, max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				count++;
				if (max < count) {
					max = count;
				}
			}
			if (nums[i] == 0) {
				count = 0;
			}
		}

		return max;
	}
}
