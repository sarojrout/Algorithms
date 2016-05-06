package com.saroj.array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int k=2;
		int[] output = RotateArray.rotate(arr, k);
		for(int i=0; i<output.length; i++){
			System.out.print(output[i]);
			System.out.print(" ");
		}
	}
	
	private static int[] rotate(int[] arr, int k){
		/*for(int i=0; i<k; i++){
			for(int j=arr.length-1; j>0; j--){
				int temp = arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}*/
		int x = 0;
		int n = arr.length;
		int[] finalArr = new int[n];
		for(int i=n-k; i<n; i++){
			finalArr[x] = arr[i];
			x++;
		}
		for(int j=0; j<n-k; j++){
			finalArr[x] = arr[j];
			x++;
		}
		return finalArr;
	}

}
