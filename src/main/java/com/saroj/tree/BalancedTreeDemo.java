/**
 * 
 */
package com.saroj.tree;

/**
 * @author saroj
 *
 */
public class BalancedTreeDemo {

	public boolean isBalanced(Tree node){
		if(node == null) return false;
		if(getHeight(node) == -1){
			return false;
		}else{
			return true;
		}
	}
	
	public int getHeight(Tree node){
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
	}

}
