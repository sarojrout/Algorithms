package com.saroj.linkedList;

public class ReverseLinkListRecursive {

	public static void main(String[] args) {
		Node a = new Node(5);
		Node b = new Node(4);
		Node c = new Node(2);
		Node d = new Node(8);
		Node e = new Node(3);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		a.printLinkList();
		Node head = reverseLinkList(a);
		head.printLinkList();
	}
	
	public static Node reverseLinkList(Node head){
		if(head == null || head.next == null){
			return head;
		}
		Node reverseList=reverseLinkList(head.next);
		head.next.next=head;
		head.next=null;
		return reverseList;
	}
	static class Node{
		public Node next;
		public int value;
		public Node(int val){
			this.value=val;
		}
		public void printLinkList(){
			Node head = this;
			while(head != null){
				System.out.println(head.value + "->");
				head = head.next;
			}
			System.out.println("");
			
		}
	}

}
