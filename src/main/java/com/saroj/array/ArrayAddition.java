package com.saroj.array;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		int[] result = new int[3];
		int c=0;
		System.out.println("enter elements of first array");
		for(int x=0; x<arr1.length; x++){
			System.out.println("eneter an element");
			arr1[x]=sc.nextInt();
		}
		System.out.println("enter elements of 2nd array");
		for(int y=0; y<arr2.length;y++){
			System.out.println("eneter an element");
			arr2[y]=sc.nextInt();
		}
		System.out.println("here is the result");
		for(int z=0; z<result.length;z++){
			result[z]=arr1[z]+arr2[z];
		}
		for(int temp: result){
			System.out.println(temp);
		}
	}


}
