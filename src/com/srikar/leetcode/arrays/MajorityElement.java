package com.srikar.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than n/2 times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * Example 1:
 * 
 * Input: [3,2,3] Output: 3 Example 2:
 * 
 * Input: [2,2,1,1,1,2,2] Output: 2
 * 
 * @author shreekar.pujari
 *
 */
public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 3 };
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int n = nums.length / 2;

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}

			if (map.get(nums[i]) > n) {
				return nums[i];
			}
		}

		return -1;
	}
}
