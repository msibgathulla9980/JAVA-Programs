package com.bridgelabz.objectorientedprograms;
import java.io.IOException;

import com.bridgelabz.utility.*;
public class AddressBookAppl {

	public static void main(String[] args) throws IOException {
		AddressBookManager addBookMan = new AddressBookManager();
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("\t\t\t\t\t*******************************ADDRESS BOOK*****************************");
			System.out.println("1:Create Book  2:Open Book  3:Save Book  4:Save As  5:Close Book  6:Quit");
			System.out.println("Enter your choice");
			int choice = DataStructureUtility.userInteger();
			switch (choice) {
			case 1:
				addBookMan.createBook();
				isRunning = true;
				break;
			case 2:
				addBookMan.openBook();
				isRunning=true;
				break;
			case 3:
				addBookMan.saveBook();
				isRunning=true;
				break;
			case 4:
				addBookMan.saveAsBook();
				isRunning=true;
				break;
			case 5:
				addBookMan.close();
				isRunning=true;
				break;
			case 6:
				System.out.println("Invalid choice");
				isRunning=false;
				break;

			}
		}
		System.out.println("You have exited");

	}
}


