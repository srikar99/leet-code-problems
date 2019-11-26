package com.srikar.leetcode.arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		RemoveElementFromArray removeElementFromArray = new RemoveElementFromArray();
		int[] nums = {3,2,2,3};
		int val = 3;
		int a = removeElementFromArray.removeElement(nums, val);
		System.out.println(a);
	}
	public int removeElement(int[] nums, int val) {

		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[a] = nums[i];
				a++;
			}
		}

		return a;
	}
}
