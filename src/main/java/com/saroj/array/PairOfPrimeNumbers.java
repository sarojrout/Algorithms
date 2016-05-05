package com.saroj.array;

public class PairOfPrimeNumbers {

	public static void main(String[] args) {
		String result = PairOfPrimeNumbers.findPairPrimeNumbers(8);

		System.out.println(result);

	}
	// check prime number
	public static boolean validatePrime(int n) {
		boolean f = true;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				f = false;
				break;
			}
		}

		return f;
	}

	private static String findPairPrimeNumbers(int data){
		StringBuilder builder = new StringBuilder();
		for(int i=2; i< data; i++){
			for(int j=2;j< data; j++){
				if(i*j <= data && validatePrime(i) && validatePrime(j) ){
					builder.append(i);
					builder.append(" ");
					builder.append(j);
					builder.append(" ");
				}
			}
		}
		return builder.toString();

	}
}
