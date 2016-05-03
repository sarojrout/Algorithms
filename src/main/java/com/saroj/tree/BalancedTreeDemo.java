/**
 * 
 */
package com.saroj.tree;

/**
 * @author saroj
 *
 */
public class BalancedTreeDemo {

	public static  boolean isBalanced(Tree node){
		if(node == null) return false;
		if(getHeight(node) == -1){
			return false;
		}else{
			return true;
		}
	}
	
	public static int getHeight(Tree node){
		int leftH = getHeight(node.leftT);
		int rightH = getHeight(node.rightT);
		if(leftH == -1 || rightH == -1){
			  return -1;
		  }
		int diff = leftH-rightH;
		if(diff > 1){
			return -1;
		}else{
			return Math.max(leftH, rightH)+1;
		}
	}
	
	static class Tree{
		Tree leftT;
		Tree rightT;
		int data;
		Tree(int val){
			this.data=val;
			leftT=rightT=null;
		}
	}

	public static void main(String[] args) {
		Tree t1 = new Tree(12);
		t1.leftT=new Tree(10);
		t1.leftT.leftT=new Tree(9);
		t1.leftT.rightT=new Tree(11);
		t1.leftT.leftT.leftT=new Tree(8);
		
		t1.rightT= new Tree(15);
		t1.rightT.leftT=new Tree(14);
		t1.rightT.rightT=new Tree(15);
		t1.rightT.leftT.leftT=new Tree(13);
		
		boolean result = BalancedTreeDemo.isBalanced(t1);
		System.out.println("Is the above Tree is balanced: "+result);		
	}
}
