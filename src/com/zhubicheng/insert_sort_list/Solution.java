package com.zhubicheng.insert_sort_list;

import com.zhubicheng.util.*;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode temp = new ListNode(0);
		s.insertionSortList(temp);
	}
	
    /**
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        // write your code here
    	if (head == null) {
			return null;
		}
    	
    	ListNode dummy = new ListNode(-1);
    	ListNode workNode = head;
    	
    	while (workNode != null) {
    		ListNode pre = dummy;
    		while (pre.next != null && pre.next.val < workNode.val) {
				pre = pre.next;
			}
    		
    		ListNode temp = workNode;
    		workNode = workNode.next;
    		temp.next = pre.next;
    		pre.next = temp;
    	}

    	return dummy.next;
    }
}
