/**
 * 
 */
package com.saroj.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author saroj
 *
 */
public class SumOfNonRepeatedElem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr={5,5,5,5,5};
		int result=SumOfNonRepeatedElem.sumOfNonRpt(arr);
		System.out.println(result);

	}
	private static int sumOfNonRptElem(int[] arr){
		int sum=0;
		Set<Integer> mySet=new HashSet<Integer>();
		
		for(int i=0; i<arr.length;i++){
			if(!mySet.contains(arr[i])){
				mySet.add(arr[i]);
			}		
		}
		List<Integer> list = new ArrayList<Integer>(mySet);
		for(int i=0; i<list.size();i++){
			sum+=list.get(i);
		}
		return sum;
	}
	
	//alternate way
	private static int sumOfNonRpt(int[] arr){
		int flag=0;
		
		int sum=0;
		for(int i=0; i<arr.length-1;i++){
			for(int j=i+1; j<arr.length;j++){
				if(i!=j){
					if(arr[i] !=arr[j]){
						flag=1;
					}else{
						flag=0;
						break;
					}
				}
			}
			List<Integer> list=new ArrayList<Integer>();
			if(flag==1){
				list = new ArrayList<Integer>();
				System.out.println(arr[i]+" ");
				list.add(arr[i]);
			}
			for(int k=0; k<list.size();i++){
				sum+=list.get(k);
			}
		}
		
		return sum;
	}

}
