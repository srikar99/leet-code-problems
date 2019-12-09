package com.srikar.leetcode.twod.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class HourGlass {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int rows = 6;
		int columns = 6;

		int sum = 0;
		int maxHourglassVal = Integer.MIN_VALUE;

		for (int i = 0; i < rows - 2; i++) {
			for (int j = 0; j < columns - 2; j++) {
				sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
						+ arr[i + 2][j + 2]);

				maxHourglassVal = Math.max(sum, maxHourglassVal);
			}
		}

		return maxHourglassVal;
	}

	static int hourglassSumJava8(int[][] arr) {
		return IntStream.range(0, 4).map(i -> {
			return IntStream.range(0, 4).map(j -> arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1]
					+ arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]).max().getAsInt();
		}).max().getAsInt();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = hourglassSum(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
