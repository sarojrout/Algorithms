package com.saroj.array;

import java.util.Arrays;

public class FindMaxDifference {

	public static void main(String[] args) {
		int[] arr ={8, 19, 3, 2, 7};
		int result = FindMaxDifference.computeDifference1(arr);
		System.out.println(result);
	}

	private static int findMaxDiff(int[] arr){
		int min = -55;
		for(int i=0; i< arr.length-1; i++){
			for(int j=i+1; j<arr.length;j++){
				if(Math.abs(arr[j]-arr[i]) > min)
					min = Math.abs(arr[j]-arr[i]);
			}
		}
		return min;
	}
	
	public static int computeDifference(int[] elements)	{
	    int max=-255;
	   Arrays.sort(elements);
	    int length=elements.length;
	    for(int i=0; i<length; i++){ 
	        if(Math.abs(elements[length-1]-elements[0]) > max){
	             max = Math.abs(elements[length-1]-elements[0]); 
	        }
	          
	        
	    }
	    
	   
	    return max;
	}
	
	public static int computeDifference1(int[] elements)	{
	    int max=-100;
	   for(int i=0; i <elements.length-1;i++){
	        for(int j=i+1; j< elements.length;j++){
	            if(Math.abs(elements[j]-elements[i]) > max){
	                max = Math.abs(elements[j]-elements[i]);
	            }
	        }
	    }
	 return max;
	}

}
