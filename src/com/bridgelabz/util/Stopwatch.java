package com.bridgelabz.util;
import java.util.Scanner;
import java.util.Arrays;
import com.bridgelabz.functionalprograms.FunctionalUtility;


public class Stopwatch { 
	public static void main(String[] args) {
		FunctionalUtility fu = new FunctionalUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to start:");
		long start=sc.nextLong();
		fu.start();
		System.out.println("Enter any number to end:");
		long end=sc.nextLong();
		fu.end();
		System.out.println("Enter 3 to display the elapsed time:");
		long elapse=sc.nextLong();
		fu.elapse();
	}

	
}