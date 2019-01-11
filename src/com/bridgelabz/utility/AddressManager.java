package com.bridgelabz.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddressManager {

	AddressBook addrbook=new AddressBook();
	List<AddressBook> addrlist=new ArrayList<AddressBook>();
	
	public void createBook() throws IOException
	{
		System.out.println("Enter the Address Book name:");
		String book=DataStructureUtility.userString();
		File file=new File("F:\\Mohammed Sibgath1\\Bridgelabz\\JavaPrograms\\JAVA-Programs\\src\\com\\bridgelabz\\objectorientedprograms\\Inventory.json");
		boolean rs=file.createNewFile();
		if (rs){
			System.out.println("Book is created");
		}
		else
		{
			System.out.println("Book of that name already exists");
		}
		 }
	public void openbook(){
		System.out.println("The Available Files are:");
		//stores all the available name of the files in the form of array of files
		File[] arrayOfFiles=new File(System.getProperty("F:\\Mohammed Sibgath1\\Bridgelabz\\JavaPrograms\\JAVA-Programs\\src\\com\\bridgelabz\\objectorientedprograms\\Inventory.json")).listFiles();
		for(File file:arrayOfFiles)
		{
			System.out.println(file+ "");
		}
	}
}
