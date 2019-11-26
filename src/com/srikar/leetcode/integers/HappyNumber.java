package com.srikar.leetcode.integers;

public class HappyNumber {

	public static void main(String[] args) {
		HappyNumber happyNumber = new HappyNumber();
		happyNumber.isHappy(19);
	}
	
	public boolean isHappy(int n) {

		while (n != 1) {
			int x = n % 10;
			int y = n / 10;
			int z = 0;
			
			if(y == 10) {
				z = y % 10;
				y = y / 10;
			}
			
			n = y * y + x * x + z * z;
		}

		return true;
	}
}
