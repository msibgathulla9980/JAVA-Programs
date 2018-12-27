/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.ReplaceString n
 *  
 *  Purpose: Print the String with User Name.
 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;
public class ReplaceString {

	public static void main(String[] args) {
		
System.out.println("Enter the username:");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
FunctionalUtility fu=new FunctionalUtility();
fu.checkconcate(s);
}

}

