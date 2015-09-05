package com.zhubicheng.largest_number;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    /**
     *@param num: A list of non negative integers
     *@return: A string
     */
	
	class NumbersComparator implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
			return (s2 + s1).compareTo(s1 + s2);
		}
	}
	
    public String largestNumber(int[] num) {
        // write your code here
    	String[] strings = new String[num.length];
    	for (int i = 0; i < num.length ; i++) {
    		strings[i] = Integer.toString(num[i]);
    	}
    	Arrays.sort(strings, new NumbersComparator());
		StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < num.length; i++) {
    		sb.append(strings[i]);
    	}
    	String results = sb.toString();
    	if (results.charAt(0) == '0') {
			return "0";
		}
    	
    	return results;
    }
}
