/**
 * 
 */
package com.saroj.linkedList;

/**
 * @author saroj
 *
 */
public class ReverseALinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node a = new Node(4);
		Node b = new Node(5);
		Node c = new Node(6);
		Node d = new Node(7);
		a.next=b;
		b.next=c;
		c.next=d;
		a.printList();
		Node reverseList=reverse(a);
		reverseList.printList();
	}
	public static Node reverse(Node head){
		Node reverse_list = head;
		Node list_todo = head.next;
		reverse_list.next=null;
		while(list_todo !=null){
			Node temp = list_todo;
			list_todo = list_todo.next;
			temp.next=reverse_list;
			reverse_list = temp;
		}
		return reverse_list;
	}
static class Node{
	public int data;
	public Node next;
	
	public Node(int d){
		this.data=d;
	}
	
	public void printList(){
		Node head = this;
		while(head !=null){
			System.out.println(head.data+"->");
			head = head.next;
		}
		System.out.println("");
	}
	
	
	
	
}
	
}
