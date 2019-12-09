package com.srikar.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class RepeatedNTimes {

	public static int repeatedNTimes(int[] A) {
		if(A.length == 0) {
            return 0;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int n = A.length / 2;
        for(int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            
            if(map.get(A[i]) == n) {
                return A[i];
            }
        }
        
        return 0;
	}
}
