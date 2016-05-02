package com.saroj.stack;

public class StackUsingLinkedList {
	
	private Node head;
	private  final LinkedList list= new LinkedList();
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	
	public void push(int val){
		
			list.insertNewNode(val);
	
	}
	public int pop(){
		int result = 0;
		while(!list.isEmpty()){
			Node deletedNode = list.delete();
			result = deletedNode.data;
			
		}
		return result;
	}
	class Node{
		int data;
		Node next;
		public Node(int val){
			this.data=val;
			this.next=null;
		}
		public void printList(){
			head = this;
			while(head !=null){
				System.out.println(head.data+"->");
				head = head.next;
			}
			System.out.println(" ");
		}
	}

	 class LinkedList{
		private Node head = null;
		private void insertNewNode(int val){
			Node newNode =  new Node(val);
			newNode.next=head;
			head = newNode;
		}
		
		
		public Node delete(){
			Node temp = head;
			head = head.next;
			return temp;
		}
		
		public boolean isEmpty(){
			return (head == null);
		}
	}
	 public static void main(String[] args) {
		 StackUsingLinkedList st = new StackUsingLinkedList();

		    st.push(50);
		    st.push(70);
		    st.push(190);
		  //  st.printList();
		    st.pop();
		  //  st.displayStack();

		  }
}
