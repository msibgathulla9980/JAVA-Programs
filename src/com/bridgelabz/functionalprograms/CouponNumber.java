package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.*;

public class CouponNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of coupons:");
		int n = sc.nextInt();
		FunctionalUtility fu = new FunctionalUtility();
		int c = fu.getcouponNumber(n);

	}

}
