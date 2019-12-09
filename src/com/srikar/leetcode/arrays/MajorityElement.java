package com.srikar.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

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
