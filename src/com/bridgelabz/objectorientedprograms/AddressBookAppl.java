package com.bridgelabz.objectorientedprograms;
/******************************************************************************
 *  Compilation:  javac -d bin AddressBookAppl.java
 *  Execution:    java -cp bin com.bridgelabz.objectorientedprograms.AddressBookAppl
 *  
 *  Purpose: Program to implement the Address Book Directory
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   19-01-2019
 *
 ******************************************************************************/

import java.io.IOException;

import com.bridgelabz.utility.*;
public class AddressBookAppl {
	   
    public static void main(String[] args) throws IOException {

        AddressBookManager addressBookManager = null;
        System.out.println("***********Address Page***********");
        do{
            System.out.println("1.Create Book 2.Open Book 3.Save Book 4.Save As Book 5.Close Book 6.exit");
            int choice = OopsUtility.userInt();
            switch (choice) {
            case 1:
                addressBookManager = AddressBookManager.getInstance();
                addressBookManager.createBook();
                break;
            case 2:
                addressBookManager = AddressBookManager.getInstance();
                addressBookManager.openBook();
                break;
            case 3:
                addressBookManager = AddressBookManager.getInstance();
                addressBookManager.saveBook();
                break;
            case 4:
                addressBookManager = AddressBookManager.getInstance();
                addressBookManager.saveAsBook();
                break;
            case 5:
                addressBookManager = AddressBookManager.getInstance();
                addressBookManager.closeBook();
                System.out.println("Book Closed");
                break;
            case 6:
                addressBookManager = null;
                System.exit(0);
                break;
            default:
                System.out.println("Please select correct choice");
            }
        }while(addressBookManager != null);

    }
}


