/**
 * 
 */
package com.saroj.string;

/**
 * @author sarojrout
 *
 */
public class ReverseANumber {
	
	private static int reverseNumber(int number){
		int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ReverseANumber.reverseNumber(123));

	}

}
