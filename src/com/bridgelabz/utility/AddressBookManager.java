package com.bridgelabz.utility;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.objectorientedprograms.AddressBookAppl;
import com.bridgelabz.utility.OopsUtility;

public class AddressBookManager {

	private static String ch_book;
	static String path="/home/admin1/MohammedSibgath/Bridgelabz/JAVA-Programs/";
	AddressBook addressBook = new AddressBook();
	ObjectMapper objectMapper = new ObjectMapper();
	List<Person> listOfPersons = new ArrayList<Person>();
	File[] files = new File(System.getProperty("user.dir")).listFiles();

	public static String getCh_book() {
		return ch_book;
	}

	public static void setCh_book(String ch_book) {
		AddressBookManager.ch_book = ch_book;
	}

	public void createBook() throws IOException {
		System.out.println("Enter name of address book");
		String book = DataStructureUtility.userString();
		File file = new File(path+ book + ".json");
		boolean rs = file.createNewFile();
		if (rs) {
			System.out.println("File is created");
		} else {
			System.out.println("File of that name already exists");
		}
	}

	public void openBook() throws IOException {
		System.out.println("Files available are:");
		for (File file : files) {	
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Choose the address book");
		ch_book = DataStructureUtility.userString();
		setCh_book(ch_book);
		for (File file : files) {
			String filename = file.getName();
			if (ch_book.equals(filename)) {
				if (file.length() > 0) {
					System.out.println("Address book is not empty");
					String string = OopsUtility.readJsonFile(filename);
					try {
						listOfPersons = objectMapper.readValue(string, new TypeReference<List<Person>>() {
						});}
					catch (Exception e){
						System.out.print("");
					}

					AddressBook.setListOfPerson(listOfPersons);
					addressBook();
				} else {
					System.out.println("Address Book is empty");
					System.out.println("Add new data onto the Address Book");
					addressBook();
				}
			}
		}
	}

	public void saveBook() {
		try {
		System.out.println("Saving " + getCh_book() + " address book");
		for (File file : files) {
			String filename = file.getName();
			if (getCh_book().equals(filename)) {
				
					String json = objectMapper.writeValueAsString(AddressBook.getListOfPerson());
					OopsUtility.writeFile(json, filename);
					System.out.println("Address book details saved");
				 
			}
		}
		}
		catch (Exception e) {
			System.out.println("Cannot write to file");
		}
	}

	public void saveAsBook() throws IOException {
		System.out.println("Files available are:");
		for (File file : files) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Choose the address book you want to save as with extention");
		String ch_book1 = DataStructureUtility.userString();
		File file = new File(path + ch_book1);
		boolean rs = file.createNewFile();
		if (rs) {
			System.out.println("File is created");
			String json = objectMapper.writeValueAsString(AddressBook.getListOfPerson());
			OopsUtility.writeFile(json, ch_book);
			System.out.println("Address book details saved");
		} else {
			System.out.println("File of that name already exists");
		}
	}

	public void close() {
		addressBook = null;
		objectMapper = null;
		listOfPersons = null;
		files = null;

	}

	public void addressBook() throws IOException {
		AddressBook ab = new AddressBook();
		//boolean i=true;
		int t=1;
		do{
			System.out.println("Enter choice");
			System.out.println("1:Add Person  2:Edit Person  3:Display Persons  4:Delete Person  5:Sort  6:Go Back to main ");
			int choice = DataStructureUtility.userInteger();
		
				switch (choice) {
				case 1:
					AddressBook.addPerson();
					//isRunning = true;
					break;
				case 2:
					AddressBook.editPerson();
					//isRunning = true;
					break;
				case 3:
					AddressBook.display();
					
					//isRunning = true;
					break;
				case 4:
					AddressBook.deletePerson();
					//isRunning = true;
					break;
				case 5:
					boolean isSort = true;
					while (isSort) {
						System.out.println("Enter your choice");
						System.out.println("1:Sort by Last Name  2:Sort by Zip Code 3.Go back");
						int ch = DataStructureUtility.userInteger();
						switch (ch) {
						case 1:
							System.out.println("Sorting by last name");
							ab.sortByLastName();
							System.out.println("Your list is sorted");
							break;
						case 2:
							System.out.println("Sorting by zip code");
							ab.sortByZipCode();
							System.out.println("Your list is sorted");
							break;
						case 3:
							addressBook();
							break;
						default:
							System.out.println("Invalid choice");
							isSort = false;
							break;
						}
					}
					break;
				case 6:
					AddressBookAppl.main(null);
				default:
					System.out.println("Invalid choice");
					//isRunning = false;
					break;
				}
			
			
		
		}while(t<10);
	}
	}



