/**
 * 
 */
package com.saroj.linkedList;

/**
 * @author sarojrout
 *
 */
public class LinkedList {
  private Node head;
  private int listCount;
  
  public void add(Object data){
    Node tempNode = new Node(data);
    Node current = head;
    while(current.getNextNode() !=null){
      current = current.getNextNode();
    }
    current.setNextNode(tempNode);
    listCount++;
  }

  public Object get(int index){
    if(index <=0 ){
      return null;
    }
    Node current = head.getNextNode();
    if(current !=null){
      current = current.getNextNode();
    }
    return current.getData();
  }
  public int size(){
    return listCount;
  }
  
  public void insertAtHead(int dataVal){
    Node newNode = new Node(dataVal);
    newNode.setNextNode(this.head);
    this.head=newNode;
  }
  
  @Override
  public String toString() {
      String res = "";
      Node curr = this.head;
      while (curr != null) {
          res += curr + ", ";
          curr = curr.getNextNode();
      }
      return res;
  }
  
}
