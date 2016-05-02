package com.saroj.linkedList;

public class ReverseLinkListIterative {

	public static void main(String[] args) {
		Node a = new Node(2);
		Node b = new Node(5);
		Node c = new Node(6);
//		Node d = new Node(3);
//		Node e = new Node(8);
		a.next=b;
		b.next=c;
//		c.next=d;
//		d.next=e;
		a.printLinkList();
		Node head = iterativeWay(a);
		head.printLinkList();
	}
	
	public static Node iterativeWay(Node head){
		Node reverse_list= head;
		Node list_todo=head.next;
		reverse_list.next=null;
		while(list_todo !=null){
			Node temp = list_todo;
			list_todo=list_todo.next;
			temp.next=reverse_list;
			reverse_list=temp;
			
		}
		return reverse_list;
	}
	//Another Approach 

	public static Node iterativeList(Node head){
		Node previous = null;
		Node nextNode = null;
		Node current = head;
		while(current != null){
			nextNode = current.next;
			current.next=previous;
			previous = current;
			current=nextNode;
		}
	return previous;			
	}
	
	
	static class Node{
		public int value;
		public Node next;
		
		public Node(int val){
			this.value=val;
		}
		public void printLinkList(){
			Node head = this;
			while(head != null){
				System.out.println(head.value+"->");
				head=head.next;
			}
			System.out.println();
		}
		
	}
}
