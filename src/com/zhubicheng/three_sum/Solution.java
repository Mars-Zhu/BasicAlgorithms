package com.zhubicheng.three_sum;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	if (numbers == null || numbers.length < 3) {
			return result;
		}
    	
    	Arrays.sort(numbers);
    	
    	for (int i = 0; i < numbers.length; i++) {
    		if (i != 0 && numbers[i] == numbers[i-1]) {
    			continue;
    		}
    		
    		int num = numbers[i];
    		int left = i + 1;
    		int right = numbers.length - 1;
    		
    		while (left < right) {
    			int sum = num + numbers[left] + numbers[right];
    			if (sum == 0) {
					ArrayList<Integer> ans = new ArrayList<Integer>();
					ans.add(num);
					ans.add(numbers[left]);
					ans.add(numbers[right]);
					result.add(ans);
					left++;
					right--;
					while (left < right && numbers[left] == numbers[left - 1]) { // to skip duplicates
						left++;
					}
					while (left < right && numbers[right] == numbers[right + 1]) { // to skip duplicates
						right--;
					}
				} else if(sum < 0) {
					left++;
				} else {
					right--;
				}
    		}
    		
    	}
    	
    	return result;
    }
}
