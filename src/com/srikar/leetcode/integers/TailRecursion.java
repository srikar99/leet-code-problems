package com.srikar.leetcode.integers;

public class TailRecursion {

	public static void main(String[] args) {
		int n = 5;
		int val = 0;
		
		// simple function to calculate sum upto 5
		// f(5) = 6 + 5 + 4 + 3 + 2 + 1 = 21
		int sum = tailRecursion(n, val);
		System.out.println(sum);
		
	}
	
	private static int tailRecursion(int n, int val) {
		if(n == 1) {
			return 1;
		}
		
		return n + tailRecursion(n - 1, n + val);
	}
}
