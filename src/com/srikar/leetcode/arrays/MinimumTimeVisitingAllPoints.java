package com.srikar.leetcode.arrays;

/**
 * On a plane there are n points with integer coordinates points[i] = [xi, yi].
 * Your task is to find the minimum time in seconds to visit all points.
 * 
 * You can move according to the next rules:
 * 
 * In one second always you can either move vertically, horizontally by one unit
 * or diagonally (it means to move one unit vertically and one unit horizontally
 * in one second). You have to visit the points in the same order as they appear
 * in the array.
 * 
 * @author shreekar.pujari
 *
 */
public class MinimumTimeVisitingAllPoints {

	public int minTimeToVisitAllPoints(int[][] points) {

		int sum = 0;
		int x = points[0][0], y = points[0][1];

		for (int i = 0; i < points.length; i++) {
			int[] e = points[i];

			sum += Math.max(Math.abs(e[0] - x), Math.abs(e[1] - y));
			x = e[0];
			y = e[1];
		}

		return sum;
	}
}
