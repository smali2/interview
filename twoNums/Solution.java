package com.google.interview.twoNums;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Count number of nodes in l1 and l2
		ListNode l1Traverse = l1;	
		ListNode l2Traverse = l2;
		
		ListNode answer = new ListNode(0);
		ListNode answerTraverse = answer;
		while (l1Traverse!=null & l2Traverse!=null) {
			int ans = l1Traverse.val + l2Traverse.val;
			if (ans>9) {
				answerTraverse.val += ans - 10;
				answerTraverse.next = new ListNode(1);
			} else {
				answerTraverse.val += ans;
			}
			l1Traverse = l1Traverse.next;
			l2Traverse = l2Traverse.next;
			if (answerTraverse.next == null) {
				answerTraverse.next = new ListNode(0);
			} else {
				answerTraverse = answerTraverse.next;
			}
			
			
		}
		
		// Now determine which of the two numbers reached null first
		if (l1Traverse==null & l2Traverse!=null) {
			answerTraverse.val += l2Traverse.val;
			while (l2Traverse.next!=null) {
				answerTraverse.next = new ListNode(l2Traverse.next.val);
				l2Traverse = l2Traverse.next;
				answerTraverse = answerTraverse.next;
			}
				
		}
		
		if (l2Traverse==null & l1Traverse!=null) {
			answerTraverse.val += l1Traverse.val;
			while (l1Traverse.next!=null) {
				answerTraverse.next = new ListNode(l1Traverse.next.val);
				l1Traverse = l1Traverse.next;
				answerTraverse = answerTraverse.next;

			}
				
		}
		return answer;
    }
	
	public void toString(ListNode listNode) {
		System.out.println("Printing out the answer:");
		while (listNode!=null) {
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode list1 = new ListNode(1);
		ListNode list1Traverse = list1;
		for (int i = 2; i<3; i++) {
			list1Traverse.next = new ListNode(i);
			list1Traverse = list1Traverse.next;
		}
		
		ListNode list2 = new ListNode(1);
		ListNode list2Traverse = list2;
		for (int i = 2; i<2; i++) {
			list2Traverse.next = new ListNode(i);
			list2Traverse = list2Traverse.next;
		}
		s.toString(list1);
		s.toString(list2);
		ListNode ans = s.addTwoNumbers(list1, list2);
		s.toString(ans);
		///
	}
}
