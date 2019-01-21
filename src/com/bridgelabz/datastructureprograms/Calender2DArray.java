package com.bridgelabz.datastructureprograms;
/******************************************************************************
 *  Compilation:  javac -d bin Calender2DArray.java
 *  Execution:    java -cp bin com.bridgelabz.datastructure program.Calender2DArray n
 *  
 *  Purpose: Write a program Calendar.java that takes the month and year as command-line arguments and prints the Calendar of the month. 
 *           Store the Calendar in an 2D Array, the first dimension the week of the month and the second dimension stores the day of the week.
 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   4-12-2018
 *
 ******************************************************************************/
import java.util.Scanner;
import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class Calender2DArray {
	public static void main(String[] args) {
		int t=0;
		do{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Month:");
		int m = s.nextInt();
		System.out.println("Enter The Year:");
		int y = s.nextInt();
		
		 FunctionalUtility.isLeap(y);
		
		DataStructureUtility.dispCalendar(m,y);
	}while(t<10);
	}
}