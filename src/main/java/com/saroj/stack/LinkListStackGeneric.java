/**
 * 
 */
package com.saroj.stack;

/**
 * @author sarojrout
 *
 */
public class LinkListStackGeneric<Item> {
	
	private Node first=null;
	private class Node{
		Item item;
		Node next;
		
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	public void push(Item item){
		Node oldFirst =first;
		first = new Node();
		first.item=item;
		first.next=oldFirst;
	}
	public Item pop(){
		Item item=first.item;
		first=first.next;
		return item;
	}
	
}
