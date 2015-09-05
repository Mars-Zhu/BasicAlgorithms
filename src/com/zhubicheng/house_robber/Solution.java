package com.zhubicheng.house_robber;

public class Solution {
    /**
     * @param A: An array of non-negative integers.
     * return: The maximum amount of money you can rob tonight
     */
    public long houseRobber(int[] A) {
        // write your code here
    	int n = A.length;    
    	long[] results = new long[n];
    	if (n == 0) {
			return 0;
		}
    	if (n > 0) {
			results[0] = A[0];
		}
    	if (n > 1) {
    		results[1] = Math.max(A[0], A[1]);
    	}
    	
    	if (n > 2) {
    		results[2] = Math.max(A[0] + A[2], A[1]);
    		for (int i = 3 ; i < n; i++) {
    			results[i] = Math.max(results[i-2] + A[i], results[i-1]);
    		}
    	}
    	
    	return results[n];
    }
}
