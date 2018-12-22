package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.utility.*;

public class CountPercentageHeadTail {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of times the coin is being flipped:");
		int n=sc.nextInt(); 
		FunctionalUtility fu=new FunctionalUtility();
		fu.getCount(n);
	}

}
