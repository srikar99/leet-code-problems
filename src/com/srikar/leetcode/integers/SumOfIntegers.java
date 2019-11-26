package com.srikar.leetcode.integers;


// Sum of integers without arithmetic operators
public class SumOfIntegers {

	public static void main(String[] args) {
		System.out.println(sum(1, 2));
	}
	
	private static int sum(int a, int b) {
		
		while(b != 0) {
			int c = a & b;
			a = a ^ b;
			b = c << 1;
		}
		
		return a;
	}
}
