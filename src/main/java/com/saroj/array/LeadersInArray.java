package com.saroj.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeadersInArray {

	public static void main(String[] args) {
		int[] arr = {16, 15, 4, 3, 14, 2,7};
		System.out.println(LeadersInArray.findLeaders(arr));

	}

	private static List<Integer> findLeaders(int[] arr){
		List<Integer> myList = new ArrayList<Integer>();
		boolean leader = true;
		for(int i=0; i<arr.length; i++){
			leader = true;
			for(int j=i+1; j<arr.length;j++){
				if(arr[j]>arr[i]){
					leader = false;
					break;
				}
			}
			if(leader){
				myList.add(arr[i]);
			}
		}


		return myList;
	}

}
