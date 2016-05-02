package com.saroj.linkedList;

public class FindIntersection {
	
	public boolean intersection(LinkedNode node1){
		
		LinkedNode slow = node1;
		LinkedNode fast = node1.next;
		while(true){
			if(fast == slow || fast.next == slow){
				return true;
			}else{
				fast = fast.next.next;
				slow = slow.next;
			}
			if(fast == null || fast.next==null){
				return false;
			}
		}
	}
	
	public static void printList(LinkedNode head){
		while(head != null){
			System.out.println(head.val+"->");
			head = head.next;
		}
		System.out.println(" ");
	}
	class LinkedNode{
		int val;
		LinkedNode next;
		public LinkedNode(int x){
			this.val=x;
			this.next=null;
		}
	}

}
