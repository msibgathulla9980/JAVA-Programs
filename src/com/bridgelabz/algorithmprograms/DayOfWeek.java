/******************************************************************************
 *  Compilation:  javac -d bin DayOfWeek.java
 *  Execution:    java -cp bin com.bridgelabz.utility.DayOfWeek
 *  
 *  Purpose: Taked the date as input and prints the day of the week that date falls on
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/ 	 
package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;



public class DayOfWeek {

	public static void main(String[] args) {
		
		
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);

			while(true) {
				System.out.println("Enter The Month");
				int m = scanner.nextInt();
				if (m < 1 || m > 12) {
					System.out.println("Months are between 1 and 12");
					break;
				}

				System.out.println("Enter The Day");
				int d = scanner.nextInt();
				if (d < 1 || d > 31) {
					System.out.println("Days are between 1 and 31");
					break;
				}

				System.out.println("Enter The Year");
				int y = scanner.nextInt();
				if (y < -10000 || y > 10000) {
					System.out.println("Years are between -10000 and 10000");
					break;
				}
			
				int d0 = AlgorithmUtility.dayofweek(m,d,y);
				String[] day={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
				System.out.println("day= "+day[d0]);

			}
		
	}
}
