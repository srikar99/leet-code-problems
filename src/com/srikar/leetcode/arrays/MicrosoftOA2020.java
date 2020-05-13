package com.srikar.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

// Given an array A of N integers, return the biggest X which occurs in A exactly X times
// e.g., {3,8,2,3,2,3} return 3 as, 3 occurs 3 times and 2 occurs 2 times, and 3 > 2
// if nothing matches return 0
public class MicrosoftOA2020 {

	public static void main(String[] args) {

		int[] A = { 3, 8, 2, 3, 2, 3 };
		System.out.println(solution(A)); // should print 3
	}

	private static int solution(int[] A) {

		if (null == A || A.length == 0) {
			return 0;
		}

		int max = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < A.length; i++) {
			map.put(A[i], map.getOrDefault(A[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getKey() == entry.getValue()) {
				if (max < entry.getKey()) {
					max = entry.getKey();
				}
			}
		}

		return max;
	}
}
