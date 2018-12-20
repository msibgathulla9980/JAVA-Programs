package com.bridgelabz.util;
import com.bridgelabz.functionalprograms.*;
import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth Harmonic Number:");
		int n=sc.nextInt();
		FunctionalUtility fu=new FunctionalUtility();
		double m=fu.getHarmonicNumber(n);
		System.out.println("The Harmonic Value is" +m);
				
	

	}

}
