/**
 * 
 */
package com.saroj.tree;

/**
 * @author sarojrout
 *
 */
public class IdenticalTree {
	public static boolean areIdentical(TreeNode tree1, TreeNode tree2){
		if(tree1 == null || tree2 ==null){
			return true;
		}
		if(tree1 != null && tree2 != null){
			return(tree1.getData() == tree2.getData() && areIdentical(tree1.getLeftChild(),tree2.getLeftChild())
					&& areIdentical(tree1.getRightChild(), tree2.getRightChild()));
		}
		return false;
	}

}
