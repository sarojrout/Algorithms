/**
 * 
 */
package com.saroj.recursive;

/**
 * @author sarojrout
 *
 */
public class MyNumberSumRec {
	
	int sum = 0;
	private int getNumberSum(int number){
		if(number == 0){
			return sum;
		}else{
			sum += (number%10);
			getNumberSum(number/10);
		}
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyNumberSumRec numSum = new MyNumberSumRec();
		System.out.println("Sum is::"+numSum.getNumberSum(259));

	}

}
