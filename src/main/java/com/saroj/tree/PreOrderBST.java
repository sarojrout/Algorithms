/**
 * 
 */
package com.saroj.tree;

import java.util.Stack;

/**
 * @author sarojrout
 *
 */
public class PreOrderBST {
	
	public static String checkBST(int[] inOrderArray){
        Stack<Integer> s = new Stack<Integer>();
        int lower = -1;
        for(int i=0;i<inOrderArray.length;i++){
            if(lower>-1 && inOrderArray[i] < lower){
                return "NO";
            }
            while(!s.isEmpty() && s.peek()<inOrderArray[i]){
                lower = s.pop();
            }
            s.push(inOrderArray[i]);
        }
        return "YES";
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] inputArr = {1,2,3,4};
		int[] inputArr1 = {3,2,1,5,4,6};
		int[] inputPreOrderArray2 = {3,4,5,1,2};
		System.out.println(PreOrderBST.checkBST(inputArr1));

	}

}
