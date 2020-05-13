package com.srikar.leetcode.imp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SocGen {

	public static void main(String[] args) throws IOException {
		System.out.println(safeFromAttack());
	}

	private static List<Integer> safeFromAttack() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> res = new ArrayList<>();
		int count = 0;
		String tt = br.readLine();
		int t = Integer.parseInt(tt);
		
		for (int i = 1; i <= t; i++) {
			
			String mString = br.readLine();

			String[] mn = mString.split(" ");

			int m = Integer.parseInt(mn[0]);
			int n = Integer.parseInt(mn[1]);

			char[][] g = new char[m][n];
			boolean[][] attacked = new boolean[m][n];
			
			for (int j = 0; j < m; j++) {
				String line = br.readLine();
				for (int k = 0; k < n; k++) {
					g[j][k] = line.charAt(k);
				}
			}

			int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
			int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

			for (int j = 0; j < m; j++) {
				for (int k = 0; k < n; k++) {
					for (int l = 0; l < 8; l++) {
						if (g[j][k] == 'n') {

							int x = j + X[l];
							int y = k + Y[l];

							// count valid moves
							if (x >= 0 && y >= 0 && x < m && y < n && g[x][y] == '_')
								attacked[x][y] = true;
						}
					}
				}
			}

			for (int j = 0; j < m; j++) {
				for (int k = 0; k < n; k++) {
					if (!attacked[j][k] && g[j][k] != 'n') {
						count++;
					}
				}
			}
			//System.out.println(count);
			res.add(count);
			count = 0;
		}

		br.close();
		return res;
	}
}
