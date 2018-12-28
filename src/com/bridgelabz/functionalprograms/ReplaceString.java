/******************************************************************************
 *  Compilation:  javac -d bin ReplaceString.java
 *  Execution:    java -cp bin com.bridgelabz.utility.ReplaceString
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
		int t=0;
		do{
System.out.println("Enter the username:");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
FunctionalUtility fu=new FunctionalUtility();
fu.checkconcate(s);
}while(t<6);
	}

}

