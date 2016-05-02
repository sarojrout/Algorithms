/**
 * 
 */
package com.saroj.dupcount;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sarojrout
 *
 */
public class RemoveDup {
	
	
	public static Set<Character> removeDup(char[] charArr){
	//	char[] charArr =  str.toCharArray();
		Set<Character> mySet = new HashSet<Character>(10);
		int read_index = 0;
		int write_index = 0;
		while(charArr[read_index] != '\0'){
			if(!mySet.contains(charArr[read_index])){
				mySet.add(charArr[read_index]);
				++write_index;
			}
			++read_index;
		}
		charArr[write_index]= '\0';
		return mySet;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abbcddde";
	//	RemoveDup.removeDup(str);
		System.out.println(RemoveDup.removeDup(str.toCharArray()));

	}

}
