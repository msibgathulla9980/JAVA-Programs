package com.bridgelabz.objectorientedprograms;
/******************************************************************************
 *  Compilation:  javac -d bin CliniqueManagementApplication.java
 *  Execution:    java -cp bin com.bridgelabz.objectorientedprograms.CliniqueManagementApplication
 *  
 *  Purpose: Program to implement the Address Book Directory
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   1-12-2018
 *
 ******************************************************************************/

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.OopsUtility;
import com.bridgelabz.utility.CliniqueManager;

public class CliniqueManagementApplication {
	public static void main(String[] args) throws IOException, JsonMappingException, JsonParseException {
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("Enter the choice");
			System.out.println("1:Add  2:Search  3:Take Appointment  4:Famous Doctor  5:Famous Specialization  6:Quit");
			int choice = OopsUtility.userInt();
			switch (choice) {
			case 1:
				CliniqueManager.add();
				isRunning = true;
				break;
			case 2:
				CliniqueManager.search();
				isRunning = true;
				break;
			case 3:
				CliniqueManager.takeAppointment();
				isRunning = true;
				break;
			case 4:
				CliniqueManager.famousDoctor();
				isRunning = true;
				break;
			case 5:
				CliniqueManager.famousSpecialist();
				isRunning=true;
				break;
			case 6:
				System.out.println("You've been Exited");
				System.exit(0);
				
				break;
			}
		}
	}
}

