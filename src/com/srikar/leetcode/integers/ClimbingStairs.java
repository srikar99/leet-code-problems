package com.srikar.leetcode.integers;

public class ClimbingStairs {
	
	public static void main(String[] args) {
		int numberOfSteps = climbStairs(44);
		System.out.println(numberOfSteps);
	}
	
	/**
	 * Uses fibonacci technique to find the number of the ways a person can climb
	 * 
	 * way(n) = way(n-1) + way(n - 2)
	 * @param n
	 * @return
	 */
	private static int climbStairs(int n) {
		if(n == 1) {
			return 1;
		}
		
		if(n == 2) {
			return 2;
		}
		
		return fibonacci(n + 1);
	}
	
	private static int fibonacci(int n) {
		int[] fib = new int[n + 2];
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		
		return fib[n];
	}

}
