package com.srikar.leetcode.integers;

public class DivideIntegers {

	public static void main(String[] args) {
		System.out.println(divide(-2147483648, 1));
	}

	public static int divide(int dividend, int divisor) {
		int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

		// Update both divisor and
		// dividend positive
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);

		if (dividend == Integer.MIN_VALUE && sign == 1) {
			dividend = Integer.MAX_VALUE;
		} else if(dividend == Integer.MIN_VALUE && sign == -1) {
			dividend = Integer.MIN_VALUE;
			return sign * dividend;
		}
		// Initialize the quotient
		int quotient = 0;

		while (dividend >= divisor) {
			dividend -= divisor;
			++quotient;
		}

		return sign * quotient;
	}
}
