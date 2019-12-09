package com.srikar.leetcode.arrays;

public class FirstAndLastIndex {

	public static void main(String[] args) {
		FirstAndLastIndex firstAndLastIndex = new FirstAndLastIndex();
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 6;
		
		int[] A = firstAndLastIndex.searchRange(nums, target);
		
		for(int a : A) {
			System.out.println(a);
		}
	}

	public int[] searchRange(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1, i = 0;
		int[] idxArr = new int[2];
		idxArr[0] = -1;
		idxArr[1] = -1;

		while (start < end) {
			int mid = start + (end - start)/ 2;
			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				if(nums[mid - 1] == target) {
					idxArr[i] = mid - 1;
					idxArr[i + 1] = mid;
					i++;
					start = mid + 1;
				}
			}
		}

		return idxArr;
	}
}
