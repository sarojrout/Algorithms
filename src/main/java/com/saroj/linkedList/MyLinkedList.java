package com.saroj.linkedList;

public class MyLinkedList {
  
  private static void printNode(Node head){
    Node temp = head;
    if(temp!=null){
      temp = temp.nextNode;
    }
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insertAtHead(1);
    list.insertAtHead(4);
    list.insertAtHead(3);

   System.out.println("Print the list::"+list.toString()+" Size::"+list.size());
   
  }

}
