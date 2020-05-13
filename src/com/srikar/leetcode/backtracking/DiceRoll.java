package com.srikar.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a recursive function diceRoll that accepts an integer representing a
 * number of 6-sided dice to roll, and output all possible combinations of
 * values that could appear on the dice.
 * 
 * @author shreekar.pujari
 *
 */
public class DiceRoll {

	public static void main(String[] args) {
		List<List<Integer>> list = diceRoll(2);
		
		for(List<Integer> l : list) {
			for(int i : l) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static List<List<Integer>> diceRoll(int n) {

		List<Integer> list = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();

		helper(res, list, n);

		return res;
	}

	private static void helper(List<List<Integer>> res, List<Integer> list, int n) {

		if (n == 0) {
			res.add(new ArrayList<>(list));
		} else {
			for(int i = 1; i <= 6; i++) {
				list.add(i);
				helper(res, list, n - 1);
				list.remove(list.size() - 1);
			}
		}
	}
}
