package com.srikar.leetcode.integers;

public class GCD {

	public static void main(String[] args) {
		System.out.println(gcd(54, 24));
		System.out.println(gcdSub(54, 24));
	}
	
	private static int gcdSub(int a, int b) {
		if(a == 0) {
			return b;
		}
		if(b == 0) {
			return a;
		}
		if(a > b) 
			return gcdSub(a - b, b);
		return gcdSub(a, b - a);
	}
	private static int gcd(int a, int b) {
		
		if(b == 0) {
			return a;
		}
		
		return gcd(b, a % b);
	}
}
