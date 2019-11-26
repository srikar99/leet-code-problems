package com.srikar.leetcode.arrays;

public class SearchInRotatedArray {
	
	public static void main(String[] args) {
		SearchInRotatedArray array = new SearchInRotatedArray();
		
		int[] nums = {};
		int target = 0;
		
		array.search(nums, target);
	}

	public int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		return search(nums, low, high, target);
	}

	private int search(int[] nums, int low, int high, int target) {
		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;

		if (nums[mid] == target)
			return mid;

		if (nums[low] <= nums[mid]) {
			if (nums[low] <= target && nums[mid] >= target) {
				return search(nums, low, mid - 1, target);
			} else {
				return search(nums, mid + 1, high, target);
			}
		} else {
			if (nums[high] >= target && nums[mid] <= target) {
				return search(nums, mid + 1, high, target);
			} else {
				return search(nums, low, mid - 1, target);
			}
		}
	}
}
