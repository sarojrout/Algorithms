package com.saroj.linkedList;

import java.util.HashSet;
import java.util.Set;

public class AnargamForInt {
	
	public static boolean isAnargam(int[] a, int[] b){
		Set<Integer> mySet = new HashSet<Integer>();
		
		while(a.length == b.length){
			for(int i = 0; i<a.length;){
				if(String.valueOf(a[i]).equals(String.valueOf(b[i]))){
					mySet.add(a[i]);
				//	break;
					return true;
				}else{
					return false;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {1,2,3,5};
		boolean result = AnargamForInt.isAnargam(a, b);
		System.out.println(result);
	}
}
