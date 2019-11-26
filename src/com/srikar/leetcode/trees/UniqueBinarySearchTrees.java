package com.srikar.leetcode.trees;

import java.util.Arrays;

public class UniqueBinarySearchTrees {

	public static void main(String[] args) {
		UniqueBinarySearchTrees uniqueBinarySearchTrees = new UniqueBinarySearchTrees();
		System.out.println(uniqueBinarySearchTrees.numTrees(3));
	}
	public int numTrees(int n) {
		int[] resultArray = new int[n + 1];
		Arrays.fill(resultArray, 0);

		resultArray[0] = 1;
		resultArray[1] = 1;

		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				resultArray[i] = resultArray[i] + (resultArray[i - j] * resultArray[j - 1]);
			}
		}

		return resultArray[n];
	}
}
