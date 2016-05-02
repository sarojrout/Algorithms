package com.saroj.sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void sort(int[] array){
		for(int i=0; i<array.length; i++){
			int current = array[i];
			int j = i-1;
			while(j >=0 && array[j] > current){
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=current;
		}
	}
	
	public static int[] doInsertionSort(int[] array){
		int temp;
		for(int i =1; i < array.length; i++){
			for(int j=i; j > 0; j--){
				if(array[j] < array[j-1]){
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		
		return array;
	}

	public static void main(String[] args) {

		int a[]={4,2,3,5,1,7};
		InsertionSort.doInsertionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
