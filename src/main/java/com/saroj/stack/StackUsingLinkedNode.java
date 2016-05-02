package com.saroj.stack;

public class StackUsingLinkedNode {
	private static final LinkedList list = new LinkedList();
	private Node head;
	public void push(int data){
	   Node current = head;
	   list.addNode(current, data);
	}
	
	public int pop(){
		int result=0;
		if(!list.isEmpty()){
			Node nodeItem = list.delete(head);
			result = nodeItem.data;
		}
		
		return result;		
	}
	
	public static void main(String[] args) {
		StackUsingLinkedNode stackNode = new StackUsingLinkedNode();
		for(int i=0; i< 10; i++){
			stackNode.push(i);
		}
		for(int i=0; i<5; i++){
			System.out.println(stackNode.pop());
		}

	}
	
	static class Node{
		Node next;
		int data;
		
		public Node(int val){
			this.data=val;
		}
	}

	static class LinkedList{
		Node head=null;
		public Node addNode(Node head, int data){
			Node newNode = new Node(data);
			newNode.next=head;
			return newNode;
		}
		
		public Node delete(Node head){
			Node current = head;
			if(current == null) return null;
			if(current == head){
				return current.next;
			}
			return current;
		}
		
		public boolean isEmpty(){
			return (head==null);
		}
	}
}
