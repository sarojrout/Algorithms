package com.saroj.array;

/**
 * Given two array A and B, print intersection (or common elements) of the two array.
If no element is common in two array, then print Zero.
 */

public class IntersectionOfArrays {

	public static void main(String[] args) {
		int[] arr1={1, 2, 3, 4, 5, 6};
		int[] arr2={3, 4, 5, 6};
		System.out.println(IntersectionOfArrays.intersect(arr1, arr2));
	}
	private static String intersect(int[] arr1, int[] arr2){
		//List<String> finalList = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i] == arr2[j]){
					sb.append(arr1[i]);
					sb.append(" ");
					break;
				}
			}
		}
		return sb.toString();
		
	}
	

}
