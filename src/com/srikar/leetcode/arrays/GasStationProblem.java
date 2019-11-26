package com.srikar.leetcode.arrays;

import java.util.List;

public class GasStationProblem {
	public int canCompleteCircuit(final List<Integer> gas, final List<Integer> cost) {
		int currentFuel = 0;
		int remaining = 0;
		int total = 0;
		int start = 0;
		for (int i = 0; i < gas.size(); i++) {
			remaining = gas.get(i) - cost.get(i);
			if (currentFuel >= 0)
				currentFuel += remaining;
			else {
				currentFuel = remaining;
				start = i;
			}
			total += remaining;
		}
		return total >= 0 ? start : -1;
	}

	// fastest solution
	public int canCompleteCircuitFastest(final List<Integer> A, final List<Integer> B) {
		int Asum = 0, Bsum = 0;
		for (int i = 0; i < A.size(); i++) {
			Asum += A.get(i);
			Bsum += B.get(i);
		}
		if (Asum < Bsum)
			return -1;
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) >= B.get(i)) {
				if (checkPossibility(A, B, i))
					return i;
			}
		}
		return -1;
	}

	public boolean checkPossibility(final List<Integer> A, final List<Integer> B, int idx) {
		int currGas = 0;
		for (int i = idx; i < idx + A.size(); i++) {
			currGas += A.get(i % A.size());
			currGas -= B.get(i % A.size());
			if (currGas < 0)
				return false;
		}
		return true;
	} // fastest soln end
}
