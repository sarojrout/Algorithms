package com.saroj.linkedList;

import java.util.HashSet;
import java.util.Set;

public class FindNonRepeating {

	public static Set<Integer> findNonRepeat(int[] nums){
		Set<Integer> mySet = new HashSet<Integer>();
		Set<Integer> newSet = new HashSet<Integer>();
		for(int i=0; i < nums.length;i++){
			if(mySet.contains(nums[i])){
				newSet.add(nums[i]);
			}else{
				mySet.add(nums[i]);
			}
			
		}
		return newSet;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,4};
		Set<Integer> result = FindNonRepeating.findNonRepeat(arr);
		System.out.println(result);
	}
	
}
