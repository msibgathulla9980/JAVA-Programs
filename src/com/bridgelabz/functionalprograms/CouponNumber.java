/******************************************************************************
 *  Compilation:  javac -d bin CouponNumber.java
 *  Execution:    java -cp bin com.bridgelabz.utility.CouponNumber
 *  
 *  Purpose: Determines total random numbers needed to have all distinct numbers.
 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.*;

public class CouponNumber {


	public static void main(String[] args) {
		int t=0;
		do{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of coupons:");
		int n = sc.nextInt();
		FunctionalUtility fu = new FunctionalUtility();
		int c = fu.getcouponNumber(n);
		System.out.println("Total random number needed to have all distinct numbers are: "+c);
	}while(t<6);

	}

}
