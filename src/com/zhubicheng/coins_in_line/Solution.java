package com.zhubicheng.coins_in_line;


public class Solution {
    /**
     * @param n: an integer
     * @return: a boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int n) {
        // write your code here
    	
    	boolean[] results = new boolean[n];
    	
    	if(n == 0 || n == 3) {
    	    return false;
    	} else if (n == 1 || n == 2) {
    	    return true;
    	}
    	
    	results[0] = false;
    	results[1] = true;
    	results[2] = true;
    	results[3] = false;
    	
    	for (int i = 4; i < n; i++) {
    		results[i] = ( results[i-2] && results[i-3] ) || ( results[i-3] && results[i-4] );
    	}
    	
    	
    	return results[n];
    }
    
}
