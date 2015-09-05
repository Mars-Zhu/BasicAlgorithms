package com.zhubicheng.unique_binary_search_tree;

public class Solution {
    /**
     * @paramn n: An integer
     * @return: An integer
     */
    public int numTrees(int n) {
        // write your code here
    	
    	if (n == 0 || n == 1) {
			return 1;
		}
    	if (n == 2) {
			return 2;
		}
    	
    	int[] count = new int[n+1];
    	count[0] = 1;
    	count[1] = 1;
    	count[2] = 2;
    	
    	for (int i = 3; i < n; i++) {
    		for (int j = 0; j < i; j++) {
    			count[i] += count[i - j - 1] * count[j];
    		}
    	}
    	
    	return count[n];
    	
    }
}
