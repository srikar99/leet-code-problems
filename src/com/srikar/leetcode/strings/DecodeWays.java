package com.srikar.leetcode.strings;

public class DecodeWays {

	public static void main(String[] args) {
		String s = "1";
		int count = decodeWays(s);
		
		System.out.println(count);
	}
	
	private static int decodeWays(String s) {
		char[] A = s.toCharArray();
		int n = A.length;
		
		return decode(A, n);
	}
	
	private static int decode(char[] A, int n) {
		
		if(A[0] == '0') {
			return 0;
		}
		
		if(n == 0 || n == 1) {
			return 1;
		}
		
		int count = 0;
		
		if(A[n - 1] > '0') {
			count = decode(A, n - 1);
		}
		
		if(A[n - 2] == '1' || A[n - 2] == '2' && A[n - 1] < '7') {
			count += decode(A, n - 2);
		}
		
		return count;
	}
}
