package com.bridgelabz.util;
import java.util.Scanner;

import com.bridgelabz.functionalprograms.FunctionalUtility;

public class LeapYear {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Year");
int r=sc.nextInt();
FunctionalUtility fu=new FunctionalUtility();
fu.getLeap(r);


	}

}
