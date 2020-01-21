package com.srikar.leetcode.arrays;

/**
 * Given an array nums of n integers where n > 1, return an array output such
 * that output[i] is equal to the product of all the elements of nums except
 * nums[i].
 * 
 * Example:
 * 
 * Input: [1,2,3,4] Output: [24,12,8,6]
 * 
 * @author shreekar.pujari
 *
 */
public class ProductOfEverythingExceptSelf {

	public int[] productExceptSelf(int[] nums) {
		int[] r = new int[nums.length];
		int product = 1;
		int zero = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				product *= nums[i];
			} else {
				zero += 1;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0 && zero == 1) {
				r[i] = product;
			} else if (zero == 0) {
				r[i] = product / nums[i];
			} else {
				r[i] = 0;
			}
		}

		return r;
	}
}
