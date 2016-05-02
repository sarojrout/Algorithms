package com.saroj.linkedList;

public class KthElementFromEnd {

	public static void main(String[] args) {
		Node a=new Node(1);
		a.append(2).append(3).append(10).append(8).append(4);
		Node result = findKthNode(a,3);
		if(result !=null){
			System.out.println(result.value);
		}
		
	}
	private static Node findKthNode(Node head, int k){
		if(head == null || k < 1){
			return null;
		}
		Node ahead = head;
		while(ahead!=null && k > 0){
			ahead = ahead.next;
			k--;
		}
		if(k!=0){
			return null;
		}
		while(ahead !=null){
			head = head.next;
			ahead = ahead.next;
		}
		return head;
	}
	private static class Node{
		int value;
		Node next;
		public Node(int val){
			this.value=val;
		}
		public Node append(int nodeVal){
			Node newNode = new Node(nodeVal);
			return newNode;
		}
	}

}
