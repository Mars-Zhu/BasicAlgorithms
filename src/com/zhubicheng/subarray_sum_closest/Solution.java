package com.zhubicheng.subarray_sum_closest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
	private class Element {
		public int index;
		public int value;
		public Element(int index, int value) {
			this.index = index;
			this.value = value;
		}
	}
    public ArrayList<Integer> subarraySumClosest(int[] nums) {
        // write your code here
    	if (nums == null || nums.length == 0) {
			return null;
		}
    	
  
    	
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	
    	if (nums.length == 0) {
			result.add(0);
			result.add(0);
			return result;
		}
    	
    	Element[] values = new Element[nums.length];
    	for (int i = 0;i < nums.length;i++) {
    		Element element = new Element(i, nums[i]);
    		values[i] = element;
    	}
    	
    	Arrays.sort(values, new Comparator<Element>() {
    		@Override
    		public int compare(Element o1, Element o2) {
    			// TODO Auto-generated method stub
    			return o1.value - o2.value;
    		}
		});
    	
    	int min = Integer.MAX_VALUE;
    	result.add(0);
    	result.add(0);
    	for (int  i = 0;  i < values.length - 1;  i++) {
			if (min > values[i+1].value - values[i].value) {
				min = values[i+1].value - values[i].value;
				if (values[i].index > values[i+i].index) {
					result.set(0, values[i+1].index);
					result.set(1, values[i].index);
				} else {
					result.set(0, values[i].index);
					result.set(1, values[i+1].index);
				}
			}
		}
    	
    	return result;
    }
}
