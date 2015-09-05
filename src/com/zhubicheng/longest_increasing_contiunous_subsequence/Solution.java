package com.zhubicheng.longest_increasing_contiunous_subsequence;

public class Solution {
    /**
     * @param A an array of Integer
     * @return  an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // Write your code here
    	if (A == null || A.length == 0) {
			return 0;
		}
    	
    	int result = 0;
    	int[] results = new int[A.length];
    	for (int i = 0; i < A.length; i++) {
    		results[i] = 0;
    	}
    	if (A.length == 1) {
			return 1;
		}
    	results[0] = 1;
    	results[1] = 2;
    	for (int i = 2; i < A.length; i++) {
    		if (A[i-1] - A[i-2] > 0) {
    			if (A[i] >= A[i-1]) {
					results[i] = results[i-1] + 1;
				} else {
					results[i] = 2;
				}
			} else {
				if (A[i] <= A[i-1]) {
					results[i] = results[i-1] + 1;
				} else {
					results[i] = 2;
				}
			}
    	}
    	for (int i = 0; i < results.length; i++) {
			if (result < results[i]) {
				result = results[i];
			}
		}
    	return result;
    }
}
