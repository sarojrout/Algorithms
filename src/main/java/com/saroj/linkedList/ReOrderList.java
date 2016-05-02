package com.saroj.linkedList;

class ListNode{
	ListNode next;
	int val;
	public ListNode(int x){
		this.val=x;
		this.next=null;
	}
	
}
public class ReOrderList {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		printList(n1);
		reOrder(n1);
		printList(n1);
	}
	
	public static void reOrder(ListNode head){
		if(head !=null && head.next != null){
			ListNode slow = head;
			ListNode fast = head;
			while(fast != null && fast.next !=null && fast.next.next != null){
				System.out.println("Pre "+slow.val +" "+fast.val);
				slow = slow.next;
				fast = fast.next.next;
				System.out.println("after "+slow.val+" "+fast.val);
			}
			ListNode second = slow.next;
			slow.next = null;
			second = reverseOrder(second);
			ListNode p1 = head;
			ListNode p2 = second;
			while(p2 != null){
				ListNode temp1 = p1.next;
				ListNode temp2 = p2.next;
				
				p1.next=p2;
				p2.next=temp1;
				p1 = temp1;
				p2=temp2;
				
			}
		}
	}
	
	public static ListNode reverseOrder(ListNode head){
		ListNode reverseList = head;
		ListNode list_to_do = head.next;
		reverseList.next=null;
		while(list_to_do != null){
			ListNode temp = list_to_do.next;
			list_to_do = list_to_do.next;
			temp.next=reverseList;
			reverseList = temp;
		}
		return reverseList;
	}
	public static void printList(ListNode head){
		while(head!=null){
			System.out.println(head.val+"->");
			head = head.next;
		}
		System.out.println(" ");
	}
	
}
