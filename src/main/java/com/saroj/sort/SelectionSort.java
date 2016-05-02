package com.saroj.sort;

import java.util.Arrays;

public class SelectionSort {
	

	public static void sort(int[] array){
		for(int i=0; i< array.length-1;i++){
			int minIndex=i;
			for(int j=i+1;j<array.length;j++){
				if(array[j] < array[i]){
					minIndex=j;
					int smallerNumber = array[minIndex];
					array[minIndex]=array[i];
					array[i]=smallerNumber;
				}
			}
		} 
	}
	public static void main(String[] args) {
		int a[] = {3,5,2,4,7,6,1};
		SelectionSort.sort(a);
		System.out.println(Arrays.toString(a));

	}

}
