package com.srikar.leetcode.integers;

public class PlusOne {

	public static void main(String[] args) {
		PlusOne one = new PlusOne();
		int[] digits = {1,2,3};
		
		one.plusOne(digits);
	}
	public int[] plusOne(int[] digits) {
		int[] ret = digits.clone();
		for (int i = ret.length - 1; i >= 0; i--) {
			if (ret[i] != 9) {
				ret[i] = ret[i] + 1;
				break;
			} else {
				ret[i] = 0;
				if (i == 0) {
					int[] newRet = new int[ret.length + 1];
					System.arraycopy(ret, 0, newRet, 1, ret.length);
					ret = newRet;
					i += 1;
				}
			}
		}
		return ret;
	}
}
