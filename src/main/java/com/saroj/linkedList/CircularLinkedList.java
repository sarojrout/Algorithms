package com.saroj.linkedList;

public class CircularLinkedList {
	
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b= new Node(4);
		Node c = new Node(3);
		Node d = new Node(2);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=a;  //comment this to print "its not circular"
		circularLinkList(a);
	}
  
 public static boolean circularLinkList(Node head){
   Node slow=head;
   Node fast=head.next;
   while(true){
     if(fast == slow || fast.next==slow){
    	 System.out.println("its circular");
       return true;
     }
     else{
       fast = fast.next.next;
       slow = slow.next;
     }    
     if(fast == null || fast.next==null){
    	 System.out.println("its not circular");
    //   return false;
     }  
   
   }  

 }
 static class Node{
	 int value;
	 Node next;
	 public Node(int val){
		 this.value=val;
	 }
	 public void printLinkList(){
		 Node head = this;
		 while(head != null){
			 System.out.println(head.value+"->");
			 head= head.next;
		 }
		 System.out.println("");
	 }
 }

}
