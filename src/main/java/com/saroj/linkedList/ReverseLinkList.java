/**
 * 
 */
package com.saroj.linkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * @author sarojrout
 *
 */
public class ReverseLinkList {
  private static Node reverseLink(Node current){
    
    if(current == null || current.nextNode == null){
      return current;
    }
  
    Node reverse_list = reverseLink(current.nextNode);
    current.nextNode.nextNode=current;
    current.nextNode=null;
    return reverse_list;
  }

}
