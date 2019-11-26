package com.srikar.leetcode.imp;

import java.util.HashMap;
import java.util.Map;

public class LongestArithmeticProgression {

	
	static abstract class X {
		int x;
		
		public void print() {
			System.out.println("message");
		}
	}
	
	public static void main(String[] args) {
		int[] A = { 83, 20, 17, 43, 52, 78, 68, 45 };
		System.out.println(lap(A));
	}

	private static int lap(int[] A) {
		
		Integer a = new Integer(25);
		Integer b = new Integer(25);
		
		System.out.println("" + (a==b));
		System.out.println("" + (a.equals(b)));

		Map<Integer, Integer> map = new HashMap<>();
		int max = 0;

		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (map.containsKey(A[j] - A[i])) {
					map.put(A[j] - A[i], map.get(A[j] - A[i]) + 1);
				} else {
					map.put(A[j] - A[i], 1);
				}
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int val = entry.getValue();
			if (max < val) {
				max = val;
			}
		}

		return max + 1;
	}
}
