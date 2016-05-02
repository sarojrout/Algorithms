package com.saroj.linkedList;

import java.util.HashSet;
import java.util.Set;

import com.saroj.linkedList.DeleteLinkNode.Node;

public class MyLinkedList1 {
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		a.next=b;
		b.next=c;
		a.printList();
	//	isCircular(a);
//		Node rlist = reverse(a);
//		rlist.printList();
		System.out.println("After adding new node");
		Node newNode = appendANodeAtTail(a,3);
		newNode.printList();
		System.out.println("After deleting a node");
		Node deleteNode = deleteANode(a);
		deleteNode.printList();
		System.out.println("after removing duplicate node");
//		int[] array = {1,2,2,3};
//		System.out.println(removeDupValues(array));
		Node removedList = removeDuplicate(a);
		removedList.printList();
	}
	//append a node at the head
	private static Node appendANodeAtHead(Node head, int data){
		Node newNode = new Node(data);
		newNode.next= head;
		return newNode;
	}
	// append a node at the last
	private static Node appendANodeAtTail(Node head, int data){
		Node current = head;
		while(current.next !=null){
			current = current.next;
		}
		current.next=new Node(data);
		return head;
	}
	private static Node deleteANode(Node head){
		Node current = head;
		if(current == null) return null;
		if(current == head){
			return current.next;
		}
		if(current==current.next){
			return current.next.next;
		}
		return current;
	}
	
	private static Node reverse(Node head){
		Node reverseList = head;
		Node list_todo = head.next;
		reverseList.next=null;
		while(list_todo !=null){
			Node temp = list_todo;
			list_todo= list_todo.next;
			temp.next=reverseList;
			reverseList=temp;
		}
		return reverseList;
	}
	
	private static boolean isCircular(Node head){
		Node fast = head.next;
		Node slow = head;
		while(true){
			if(fast == slow || fast.next==slow){
				System.out.println("Its circular");
				return true;
			}else{
				fast = fast.next.next;
				slow = slow.next;
			}
			if(fast == null || fast.next == null){
				System.out.println("its not circular");
				return false;
			}
		}
	}
	
	//Another way to detect a cycle 
	static int HasCycle(Node head) {
	    Node fast = head;
	    Node slow = head;
	while (fast != null) {
	    fast = fast.next;
	    if (fast == null) {
	        return 0;
	    }
	    fast = fast.next;
	    if (fast==slow) {
	        return 1;
	    } else {
	        slow = slow.next; 
	    }
	}
	return 0;
	} 

	
	private static Node removeDuplicate(Node head){
		Node current = head;
		Set<Integer> mySet = new HashSet<Integer>();
		mySet.add(current.data);
		while(current.next != null){
			if(!mySet.contains(current.next.data)){
				mySet.add(current.next.data);
				current=current.next;
			}else{
				current.next=current.next.next;
			}
			
		}
		return head;
		
	}
	
	private static Set<Integer> removeDupValues(int[] intArr){
		Set<Integer> mySet = new HashSet<Integer>();
		for(int i =0; i<intArr.length; i++){
			if(!mySet.contains(intArr[i])){
				mySet.add(intArr[i]);
			}
		}
		return mySet;
	}
	static class Node{
		Node next;
		int data;
		Node(int d){
			this.data=d;
		}
		public void printList(){
			Node current=this;
			while(current!=null){
				System.out.println(current.data+"->");
				current = current.next;
			}
			System.out.println();
			
		}
	}

}


