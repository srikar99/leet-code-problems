package com.srikar.leetcode.integers;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println(decimalToBinary(15));
		bitwiseDecToBin(4);
	}
	
	private static String decimalToBinary(int n) {
		int[] a = new int[32];
		int i = 0;
		
		while(n > 0) {
			int x = n % 2;
			a[i] = x;
			i++;
			n /= 2;
		}
		String s = "";
		for(int j = a.length - 1; j >= 0; j--) {
			 s += a[j] + "";
		}
		
		return s;
	}
	
	private static void bitwiseDecToBin(int n) {
		
		for(int i = 31; i >= 0; i--) {
			int j = n >> i;
			if((j & 1) == 1) {
				System.out.print("1");
			} else {
				System.out.print("0");
			}
		}
	}
}
