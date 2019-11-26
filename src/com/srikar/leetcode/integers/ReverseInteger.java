package com.srikar.leetcode.integers;

public class ReverseInteger {

	public static void main(String[] args) {
		int i = reverseInt(1234);
		System.out.println(i);
	}
	private static int reverseInt(int x) {
		int a = 0, b = 0;
        while(x != 0) {
            int y = x % 10;
            a = a * 10 + y;
            if((a-y) / 10 != b) {
                return 0;
            }
            b = a;
            x = x / 10;
        }
        
        return a;
	}
}
