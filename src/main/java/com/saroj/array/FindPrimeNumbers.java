package com.saroj.array;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumbers {

	public static void main(String[] args) {
		List<Integer> result = FindPrimeNumbers.findPrimes(5);
		System.out.println(FindPrimeNumbers.findPrimes(5));

	} 
	private static List<Integer> findPrimes(int n){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=2; i< n; i++){
			if(isPrime(i)){
				list.add(i);
				
			}
		}
		return list;
	}
	private static boolean isPrime(int n){
		for(int i=2; i<=n/2; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
