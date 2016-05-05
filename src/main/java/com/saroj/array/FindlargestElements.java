package com.saroj.array;

import java.util.Arrays;

public class FindlargestElements {

	public static void main(String[] args) {
		int[] arr={1,2,4,12,5,7};
		int n = 3;
		String result = FindlargestElements.findLargest(arr, n);
		System.out.println(result);

	}
private static String findLargest(int[] arr, int noOfElem){
	StringBuilder sb = new StringBuilder();
	sort(arr);
	for(int i=0; i<noOfElem;i++){
		sb.append(arr[i]);
		sb.append(" ");
	}
	return sb.toString();
}
	private static void sort(int[] arr){
		for(int i=0; i<arr.length-1; i++){
			for(int j=i; j<arr.length; j++){
				if(arr[j] > arr[i]){
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
}
