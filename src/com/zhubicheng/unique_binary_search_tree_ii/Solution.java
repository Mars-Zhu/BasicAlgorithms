package com.zhubicheng.unique_binary_search_tree_ii;

import java.util.ArrayList;
import java.util.List;

import com.zhubicheng.util.*;

public class Solution {
    /**
     * @paramn n: An integer
     * @return: A list of root
     */
    public List<TreeNode> generateTrees(int n) {
        // write your code here
    	return genenateSubTree(1, n);
    	
    }
    
    private ArrayList<TreeNode> genenateSubTree(int start, int end) {
		ArrayList<TreeNode> trees = new ArrayList<TreeNode>();
		if (start > end) {
			trees.add(null);
			return trees;
		}
		
		for (int i = start; i <= end; i++) {
			ArrayList<TreeNode> left = genenateSubTree(start, i-1);
			ArrayList<TreeNode> right = genenateSubTree(i+1, end);
			
			for (TreeNode m : left) {
				for (TreeNode j : right) {
					TreeNode t = new TreeNode(i);
					t.left = m;
					t.right = j;
					trees.add(t);
				}
			}
		}
		return trees;
	}
    
}
