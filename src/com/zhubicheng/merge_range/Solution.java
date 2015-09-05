package com.zhubicheng.merge_range;
import java.util.ArrayList;
import java.util.List;

import com.zhubicheng.util.*;
public class Solution {
	public static void main(String[] args) {
		List<Interval> results = new ArrayList<>();
		results.add(new Interval(1,4));
		results.add(new Interval(0, 2));
		results.add(new Interval(3, 5));
		Solution s = new Solution();
		System.out.println(s.merge(results));
	} 
    /**
     * @param intervals: Sorted interval list.
     * @return: A new sorted interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
    	List<Interval> results = new ArrayList<>();
    	if (intervals == null || intervals.size() == 0) {
			return null;
		}
    	
    	if (intervals.size() == 1) {
    		return intervals;
    	}
    	//sort 
    	for (int i = 1; i < intervals.size(); i++) {
    		Interval key = intervals.get(i);
    		int j = i - 1;
    		while ( j >= 0  && intervals.get(j).start > key.start) {
    			intervals.set(j + 1, intervals.get(j));
    			j = j - 1;
    		}
    		intervals.set(j+1, key);
    	}
    	
    	//merge
        Interval prev = null;
        for (Interval item : intervals) {

            if (prev == null || prev.end < item.start) {
                results.add(item);
                prev = item;
            } else if (prev.end < item.end) {
                prev.end = item.end;
            }
        }
    
    	return results;
    }
    
}
