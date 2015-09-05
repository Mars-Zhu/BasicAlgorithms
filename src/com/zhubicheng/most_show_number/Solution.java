package com.zhubicheng.most_show_number;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int num = s.nextInt();
		Map<Integer, Integer> workMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < num; i++) {
			int nextInt = s.nextInt();
			if (workMap.containsKey(nextInt)) {
				workMap.put(nextInt, workMap.get(nextInt) + 1);
			} else {
				workMap.put(nextInt, 1);
			}
		}
		
		Set<Map.Entry<Integer, Integer>> set = workMap.entrySet();
		int max = 0,key = 0;
        for (Entry<Integer, Integer> entry : set) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            } else if(entry.getValue() == max){
            	if (key > entry.getKey()) {
					key = entry.getKey();
				}
            }
        }
        System.out.println(key);
	}
}
