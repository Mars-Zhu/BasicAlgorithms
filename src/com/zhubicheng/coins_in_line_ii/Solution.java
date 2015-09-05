package com.zhubicheng.coins_in_line_ii;


public class Solution {
    /**
     * @param values: an array of integers
     * @return: a boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int[] values) {
        // write your code here
    	int n = values.length;
    	int[] results = new int[n+1];
    	
    	if (n == 0 || n == 1 || n == 2) {
			return true;
		}

    	
    	results[0] = 0;
    	results[1] = values[n - 1];
    	results[2] = values[n - 2] + values[n - 1];
    	results[3] = values[n - 2] + values[n - 3];
    	
    	for (int i = 4; i <= n; i++) {
    		int a = Math.min(results[i - 2], results[i - 3]) + values[n - i];
    		int b = Math.min(results[i - 3], results[i - 4]) + values[n - i]+ values[n - i + 1];
    		results[i] = Math.max(a, b);
    	}
    	int sum = 0;
        for(int now : values) 
            sum += now;
        
    	return sum < 2*results[n]; 
    	
    }
    

    
    
}
