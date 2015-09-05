package com.zhubicheng.sort_colors;


public class Solution {
	
    /**
     * @param nums: A list of integer which is 0, 1 or 2 
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        // write your code here
    	if (nums == null || nums.length == 0) {
    		return;
    	}
    	
    	int head = 0;
    	int tail = nums.length - 1;
    	int i = 0;
    	while (i <= tail) {
    		if (nums[i] == 0) {
    			swap(nums, head, i);
    			head++;
    			i++;
    		} else if (nums[i] == 1) {
    			i++;
    		} else {
    			swap(nums, i,tail);
    			tail--;
    		}
    	}
    	
    }
    
    
	protected void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}
