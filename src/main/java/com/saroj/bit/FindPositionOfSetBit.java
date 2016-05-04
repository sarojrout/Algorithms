package com.saroj.bit;

public class FindPositionOfSetBit {
	public static void main(String[] args) {
		int result = FindPositionOfSetBit.findPos(10);
		System.out.println(result);
	}

	private static int findPos(int data){
		double result = Math.log(data) / Math.log(2);
		if(result%2==0){
			return (int)result+1;
		}
		else{
			return -1;
		}
	}
}
