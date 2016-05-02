/**
 * 
 */
package com.saroj.linkedList;

/**
 * @author sarojrout
 *
 */
//http://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/

public class Node {
  public Object data;
  public Node nextNode;
  
  public Node(Object dataValue){
    nextNode = null;
    data = dataValue;
  }
  public Node(Object dataValue, Node nextVal){
    data = dataValue;
    nextNode = nextVal;
  }

  /**
   * @return the nextNode
   */
  public Node getNextNode() {
    return nextNode;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  /**
   * @param nextNode the nextNode to set
   * @return 
   */
  public void setNextNode(Node nextNode) {
    this.nextNode = nextNode;
  }

}
