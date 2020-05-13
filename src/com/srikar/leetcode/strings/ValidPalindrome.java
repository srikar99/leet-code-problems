package com.srikar.leetcode.strings;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("0P"));
		convertToTitle(1);
	}

	private static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}

		return true;
	}

	public static void convertToTitle(int n) {
		int A = 64, Z = 64;
		int y = n / 26;
		
		char d = 0;
		if(n % 26 == 0) {
			Z = 64 + 26;
		}
		
		char c = (char) (Z + (n % 26));
		
		if (y > 0) {
			if(n % 26 == 0) {
				y--;
			}
			d = (char) (A + y);
		}

		System.out.println(c);
		System.out.println(d);
		
		String s = "" + d + c;
		System.out.println(s);
	}
}
