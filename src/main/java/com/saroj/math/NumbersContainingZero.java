package com.saroj.math;

public class NumbersContainingZero {

	public static void main(String[] args) {
		int result=NumbersContainingZero.countNo(100);
		System.err.println(result);

	}
	private static int countNo(int n){
		int count=0;
		for(int i=0; i<=n;i++){
			count+=has0(i);
		}
		return count;
	}
	private static int has0(int x){
		int count=0;
		if(x%10==0 || x/10==10){
			count++;
		}
		return count;
	}

}
