/**
 * 
 */
package com.saroj.linkedList;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/**
 * @author sarojrout
 *
 */
public class RemoveDupNodes {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Node a = new Node(5);
    Node b = new Node(4);
    Node c = new Node(6);
    Node d = new Node(7);
    Node e = new Node(6);
//    Node f = new Node(6);
//    Node g = new Node(7);
//    Node h = new Node(2);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
//    e.next=f;
//    f.next=g;
//    g.next=h;
    a.printList();
  
  RemoveDupNodes.removeDuplicates(a);
  System.out.println("After removing the duplicates");
  a.printList();
  }
  public static void removeDup1(Node head){
    Node prev = null;
    Hashtable table = new Hashtable();
    while(head != null){
      if(table.containsKey(head.value)){
        prev.next=head.next;
      }else{
        table.put(head.value, true);
        prev=head;
      }
      head = head.next;
    }
 //   return head;
  }
  
  private static void removeDupwithHash(Node head){
    Set mySet = new HashSet();
    Node prev = null;
    while(head != null){
    //  current = head.next;
      if(mySet.contains(head.value)){
        prev.next=head.next;
      }else{
        mySet.add(head.value);
        prev=head;
      }
      head= head.next;
    }
  //  return head;
  }
  
  public static Node removeDup(Node head){
    if(head==null){
      return null;
    }
    Node runner = null;
    while(head !=null){
      runner=head;
      while(runner.next !=null){
        if(runner.next.value == head.value){
          runner.next=runner.next.next;
        }else{
          runner=runner.next;
        }
      }
      head = head.next;
    }
    return head;
  }
  
  public static Node removeDuplicates(Node head) {  
	    Node current=head;
	        if(current==null)
	            return head;
	        while(current!=null && current.next!=null)
	        {
	          if(current.value==current.next.value)
	              current.next=current.next.next;
	           else
	               current=current.next;

	        }
	        return head;
	    }
  
  static class Node{
    int value;
    Node next;
    public Node(int val){
      this.value=val;
    }
    
    public void printList(){
      Node head = this;
      while(head !=null){
        System.out.println(head.value+"->");
        head=head.next;
      }
      System.out.println("");
    }
  }

 
  
}
