package com.zhubicheng.smallest_different;

import java.util.Arrays;


public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		int result = s.smallestDifference(new int[]{3}, new int[]{10,8,16,19,6});
		System.out.println(result);
	}
    /**
     * @param A, B: Two integer arrays.
     * @return: Their smallest difference.
     */
    public int smallestDifference(int[] A, int[] B) {
        // write your code here
    	if (A == null || B == null) {
			return 0;
		}
    	Arrays.sort(A);
    	Arrays.sort(B);
    	
    	int result = Integer.MAX_VALUE;
    	for (int ia = 0, ib = 0 ; ia < A.length && ib < B.length; ia++) {
    		while (ib + 1 < B.length && B[ib + 1] < A[ia]) {ib++;}
			result = Math.min(result, Math.abs(B[ib] - A[ia]));
    		if (ib + 1 < B.length) {
    			result = Math.min(result, Math.abs(B[ib + 1] - A[ia]));
    		}
    	}
    	return result;
    }
}
