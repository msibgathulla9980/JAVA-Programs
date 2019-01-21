/******************************************************************************
 *  Compilation:  javac -d bin CouponNumber.java
 *  Execution:    java -cp bin com.bridgelabz.utility.CouponNumber
 *  
 *  Purpose: Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct
 *            coupon number? This program simulates this random process.

 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   23-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.*;

public class CouponNumber {


	public static void main(String[] args) {
		int t=0;
		do{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of coupons:");
		int n = sc.nextInt();
		int c = FunctionalUtility.getcouponNumber(n);
		System.out.println("Total random number needed to have all distinct numbers are: "+c);
	}while(t<6);

	}

}
