package com.srikar.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a recursive function diceRoll that accepts an integer representing a
 * number of 6-sided dice to roll, and output only those combination equal to a
 * sum
 * 
 * @author shreekar.pujari
 *
 */
public class DiceRollSum {
	public static void main(String[] args) {
		List<List<Integer>> list = diceRoll(2, 7);

		for (List<Integer> l : list) {
			for (int i : l) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static List<List<Integer>> diceRoll(int n, int sum) {

		List<Integer> list = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();

		helper(res, list, n, sum, 0);

		return res;
	}

	private static void helper(List<List<Integer>> res, List<Integer> list, int n, int sum, int currSum) {

		if (n == 0) {
			if (currSum == sum) {
				res.add(new ArrayList<>(list));
			}
		} else if(currSum + 1 * n <= sum && currSum + 6*n >= sum){
			for (int i = 1; i <= 6; i++) {
				list.add(i);
				helper(res, list, n - 1, sum, i + currSum);
				list.remove(list.size() - 1);
			}
		}
	}
}
