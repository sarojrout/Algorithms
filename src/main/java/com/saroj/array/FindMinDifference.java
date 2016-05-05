package com.saroj.array;

public class FindMinDifference {

	public static void main(String[] args) {
		int[] arr ={2,4,5,7,9};
		int result = FindMinDifference.findMinDiff(arr);
		System.out.println(result);
	}

	private static int findMinDiff(int[] arr){
		int min = 1000;
		for(int i=0; i< arr.length-1; i++){
			for(int j=i+1; j<arr.length;j++){
				if(Math.abs(arr[j]-arr[i]) < min)
					min = Math.abs(arr[j]-arr[i]);
			}
		}
		return min;
	}
}
