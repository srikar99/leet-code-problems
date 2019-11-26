package com.srikar.leetcode.integers;

public class FloorSqrt {

	public static void main(String[] args) {
		sqrt(2147395600);
	}

	private static int sqrt(int x) {
		int result = 1, i = 1;

		if (x == 0 || x == 1) {
			return x;
		}

		while (result <= x && result > 0) {
			i++;
			result = i * i;
		}

		return i - 1;
	}
}
