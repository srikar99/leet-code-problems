package com.srikar.leetcode.arrays;

import java.nio.ByteBuffer;

public class ByteArrayToInt {

	public static void main(String[] args) {
		byte[] arr = {0, -60};
		ByteBuffer wrapped = ByteBuffer.wrap(arr);
		
		Short i = wrapped.getShort();
		System.out.println(i.intValue());
	}
}
