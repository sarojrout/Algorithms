/**
 * 
 */
package com.saroj.linkedList;

/**
 * @author sarojrout
 *
 */
public class DeleteLinkNode {
  
  public static void main(String[] args) {
    Node a = new Node(12);
    Node b= new Node(5);
    Node c = new Node(4);
    Node d = new Node(3);
    a.nextNode=b;
    b.nextNode=c;
    c.nextNode=d;
    a.printList();
    DeleteLinkNode.deleteANode(a);
    System.out.println("after removing one");
    a.printList();
   // System.out.println();
  }
	public static Node deleteANode(Node head){
		Node prev = null;
		Node current = head;
		
		while(current != null){
			prev = current;
			current = current.nextNode;
		}
		if(current == head){
			return current.nextNode;
		}
		prev.nextNode=current.nextNode;
		return current;
	}
	
	static class Node{
	  int value;
	  Node nextNode;
	  public Node(int val){
	    this.value=val;
	  }
	  public void printList(){
	    Node head =this;
	    while(head!=null){
	      System.out.println(head.value+"->");
	      head=head.nextNode;
	    }
	    System.out.println("");
	  }
	}

}
