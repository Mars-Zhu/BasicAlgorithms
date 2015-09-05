package com.zhubicheng.max_product_subarray;


public class Solution {
    /**
     * @param nums: an array of integers
     * @return: an integer
     */
	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.maxProduct(new int[]{2,3,-2,4}));
	}
    public int maxProduct(int[] nums) {
        // write your code here
    	int n = nums.length;
    	if (n == 0) {
			return 0;
		}
    	if (n ==  1) {
			return nums[0];
		}
    	
    	
    	int[] max = new int[n];
    	int[] min = new int[n];
    	max[0] = min[0] = nums[0];
    	for (int i = 1; i < n; i++) {
			if (nums[i] > 0) {
				max[i] = Math.max(max[i - 1] * nums[i], nums[i]);
				min[i] = Math.min(min[i - 1] * nums[i], nums[i]);
			} else {
				max[i] = Math.max(min[i - 1] * nums[i], nums[i]);
				min[i] = Math.min(max[i - 1] * nums[i], nums[i]);
			}
		}
    	
    	int result = Integer.MIN_VALUE;
    	for (int i = 0; i < max.length; i++) {
			if (result < max[i]) {
				result = max[i];
			}
		}
    	return result;
    }
}
