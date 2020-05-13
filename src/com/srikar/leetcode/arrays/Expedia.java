package com.srikar.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Expedia {

	public static long subsets(List<Long> nums, long t) {

		List<List<Long>> list = new ArrayList<>();
		Collections.sort(nums);
		backtrack(list, new ArrayList<>(), nums, 0);

		long[] diff = new long[list.size()];
		long sum = 0;
		int j = 0;

		for (List<Long> l : list) {
			// System.out.println(l);
			for (int i = 0; i < l.size(); i++) {
				sum += l.get(i);
			}
			// System.out.println(Math.abs(t - sum));
			diff[j++] = Math.abs(t - sum);
			sum = 0;
		}

		long min = Long.MAX_VALUE;

		for (int i = 0; i < diff.length; i++) {
			min = Math.min(min, diff[i]);
		}

		return t - min;
	}

	private static void backtrack(List<List<Long>> list, List<Long> temp, List<Long> nums, int start) {
		list.add(new ArrayList<>(temp));
		for (int i = start; i < nums.size(); i++) {
			temp.add(nums.get(i));
			backtrack(list, temp, nums, i + 1);
			temp.remove(temp.size() - 1);
		}
	}

	static long findMaxSubarraySum(List<Long> arr, int n, long sum) {
		long curr_sum = arr.get(0);
		long max_sum = 0;
		int start = 0;

		for (int i = 1; i < n; i++) {

			if (curr_sum <= sum)
				max_sum = Math.max(max_sum, curr_sum);

			while (curr_sum + arr.get(i) > sum && start < i) {

				for (int j = 0; j < n; j++) {
					curr_sum -= arr.get(j);
				}
			}

			curr_sum += arr.get(i);
		}

		if (curr_sum <= sum)
			max_sum = Math.max(max_sum, curr_sum);

		return max_sum;
	}

	public static void main(String[] args) {
		List<Long> list = new ArrayList<Long>();
		Long[] array = new Long[] { 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L,
				19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 31L, 32L, 33L, 34L, 35L, 36L, 37L, 38L, 39L };
		list = Arrays.asList(array);
		// list.add((long) 5);

		// int n = list.size();
		long sum = 48;

		System.out.println(System.currentTimeMillis());
		long l = subsets(list, sum);
		System.out.println(l);
		System.out.println(System.currentTimeMillis());
	}
}
