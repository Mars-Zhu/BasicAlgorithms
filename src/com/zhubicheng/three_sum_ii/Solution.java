package com.zhubicheng.three_sum_ii;

import java.util.Arrays;

public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers ,int target) {
        // write your code here
    	if (numbers == null || numbers.length < 3) {
			return 0;
		}
    	int result = 0;
    	int min = Integer.MAX_VALUE;
    	Arrays.sort(numbers);
    	
    	for (int i = 0; i < numbers.length; i++) {

    		int num = numbers[i];
    		int left = i + 1;
    		int right = numbers.length - 1;
    		
    		while (left < right) {
    			int sum = num + numbers[left] + numbers[right];
    			int delt = sum - target;
    			if (delt >= 0) {
					right--;
				} else {
					left++;
				}
    			if (min > Math.abs(delt)) {
					min = Math.abs(delt);
					result = sum;
				}
    		}
    		
    	}
    	
    	return result;
    }
}
