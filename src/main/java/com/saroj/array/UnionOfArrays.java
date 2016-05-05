package com.saroj.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two array A and B, find union between these two array.  
 * If there are repetitions, then only one occurrence of element should be printed in union.
 *
 */
// There are 2 solutions for this problem as below

public class UnionOfArrays {

	public static void main(String[] args) {
		String[] arr1 = {"1","1","8","2","3","4","5"};
		String[] arr2 = {"7","2","3","5","6"};
		Set<String> resultSet = UnionOfArrays.union(arr1, arr2);
		List<String> myList = new ArrayList<String>(resultSet);
		Collections.sort(myList, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.toString().compareTo(o2.toString());
			}	
		});
	//	System.out.println(myList);
		System.out.println(UnionOfArrays.unionArrays(arr1, arr2));

	}

	private static Set<String> union(String[] arr1, String[] arr2){
		Set<String> mySet  = new HashSet<String>();		
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j< arr2.length; j++){
				mySet.add(arr1[i]);
				mySet.add(arr2[j]);								
			}
		}
		return mySet;
	}
	
	private static List<String> unionArrays(String[] arr1, String[] arr2){
		List<String> finalList = new ArrayList<String>();
		String[] finalArr = new String[arr1.length+arr2.length];
		int i=0;
		for(String s : arr1){
			finalArr[i]=s;
			i++;
		}
		for(String s: arr2){
			finalArr[i]=s;
			i++;
		}
		sort(finalArr);
		for(int j=0; j<finalArr.length;j++){
			if(!finalList.contains(finalArr[j])){
				finalList.add(finalArr[j]);
			}
		}
		return finalList;
	}
	
	private static void sort(String[] arr){
	
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length;j++){
				if(Integer.parseInt(arr[j]) < Integer.parseInt(arr[i])){
					String temp=arr[j];
					arr[j]=arr[i];
					arr[i]= temp;
				}
			}
		}
	}
}
