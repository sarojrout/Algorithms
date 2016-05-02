package com.saroj.linkedList;

public class DeleteNodeFromLinkList {
  
  public Node deleteNode(Node head){
    Node prev = null;
    Node current = head;
    
    while(current !=null){
      prev = current;
      current = current.nextNode;
    }
    if(current == null){
      return head;
    }
    if(current == head){
      return current.nextNode;
    }
    prev.nextNode=current.nextNode;
    return head;
  }
 

}
