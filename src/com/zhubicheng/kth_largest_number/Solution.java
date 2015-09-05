package com.zhubicheng.kth_largest_number;

import java.util.ArrayList;
import java.util.Arrays;


public class Solution {
    //return: description of return
    
	private void swap(Integer[] A, int a, int b) {
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
	
	private int findkth(int k, Integer[] nums, int left, int right) {
		int num  = nums[right];
		int start = left;
		int end = right - 1;
		while (true) {
			while (nums[start] < num && left < right) {
				start++;
			}
			while (nums[end] >= num && left < right) {
				end--;
			}
			if (start == end) {
				break;
			}
			swap(nums, start, end);
		}
		swap(nums, left, right);
		if (k == left + 1) {
			return left;
		} else if (k > left) {
			return findkth(k, nums, start, left - 1);
		} else {
			return findkth(k, nums, left + 1, end);
		}
	}
	
	public int kthLargestElement(int k, ArrayList<Integer> numbers) {
        // write your code here
		if (numbers == null) {
			return 0;
		}
		Integer[] nums = numbers.toArray(new Integer[numbers.size()]);
		int result = numbers.get(findkth(k, nums, 0, numbers.size() - 1));
		
        return nums[result];
    }
    
    
    
    public int kthLargestElement_solve_0(int k, ArrayList<Integer> numbers) {
        // write your code here
        Integer[] ints = numbers.toArray(new Integer[numbers.size()]); 
        Arrays.sort(ints);
        return ints[k];
    }
}
