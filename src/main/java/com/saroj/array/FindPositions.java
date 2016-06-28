package com.saroj.array;

import java.util.ArrayList;
import java.util.List;

public class FindPositions {
	
		public static void main(String[] args) {
			Node n1 = new Node(1,0, "A");
			Node n2 = new Node(2,3, "B");
			Node n3 = new Node(3,1, "C");
			Node n4 = new Node(4,2, "F");
			Node n5 = new Node(5,3, "O");
			Node n6 = new Node(6,1, "M");
			Node n7 = new Node(7,6, "G");
			Node[] arr = {n1,n2,n3,n4,n5,n6,n7};
			TreeNode tree = new TreeNode();
			prettyPrint(arr,tree);
		}

	private static void prettyPrint(Node[] arr, TreeNode tree){	
		
		for(int i=0; i<arr.length;i++){
			if(arr[i].parentId !=0){
				tree.setId(arr[i].parentId);
				tree.setName(arr[i].name);
				System.out.println(tree+" ");
			}
		}
		
	}
	

}
class TreeNode{
    @Override
	public String toString() {
		return "TreeNode [id=" + id + ", node=" + node + ", position=" + position + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	int id;
	Node node;
	int position;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Node{
	
	int id;
	int parentId;
	String name;
	Node(int id, int pId, String n){
		this.id=id;
		this.parentId=pId;
		this.name=n;
	}
	
	
	
}