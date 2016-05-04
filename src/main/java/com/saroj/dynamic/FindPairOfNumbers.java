package com.saroj.dynamic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class FindPairOfNumbers {

	public static void main(String[] args) {
		int[] arr = {1,2,5,98,99,95};
		Map<Integer,Integer> map = FindPairOfNumbers.getPairs(arr, 100);
		for(Entry<Integer, Integer> entry:map.entrySet()){
			System.out.println(entry.getKey()+","+entry.getValue());
		}

	}
	
	private static Map<Integer, Integer> getPairs(int[] arr, int target){
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for(int i=0;i<arr.length-1; i++){
			for(int j=i+1; j<arr.length;j++){
				if(arr[i]+arr[j]==target){
					result[0]=arr[i];
					result[1]=arr[j];
					myMap.put(result[0], result[1]);
				}
			}
		}
		return myMap;
	}

}
