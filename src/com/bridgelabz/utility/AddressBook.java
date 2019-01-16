package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AddressBook {

private static List<Person> listOfPerson=new ArrayList<Person>();
	
	public void addPerson(){
		Person person=new Person();
		System.out.println("Enter first name");
		person.setFirstname(DataStructureUtility.userString());
		System.out.println("Enter last name");
		person.setLastname(DataStructureUtility.userString());
		System.out.println("Enter contact number");
		person.setPhonenumber(DataStructureUtility.userLong());
		Address address=new Address();
		System.out.println("Enter street");
		address.setStreet(DataStructureUtility.userString());
		System.out.println("Enter city");
		address.setCity(DataStructureUtility.userString());
		System.out.println("Enter state");
		address.setState(DataStructureUtility.userString());
		System.out.println("Enter zipcode");
		address.setZipcode(DataStructureUtility.userLong());
		person.setAddr(address);
		listOfPerson.add(person);
	}
	
	public void editPerson(){
		int edit=1;
		System.out.println("Enter the details of the person whose information needs to be modified");
		System.out.println("Enter first name");
		String firstName=DataStructureUtility.userString();
		System.out.println("Enter last name");
		String lastName=DataStructureUtility.userString();
		for(Person per:listOfPerson){
			if(firstName.equals(per.getFirstname()) && lastName.equals(per.getLastname())){
				while(edit==1){
				System.out.println("Enter the choice you want modify");
				System.out.println("1:Contact Number  2:Address");
				int choice=DataStructureUtility.userInteger();
				switch(choice){
				case 1: System.out.println("Enter the new contact number");
						long newContact=DataStructureUtility.userLong();
						per.setPhonenumber(newContact);
						System.out.println("Your contact number is updated");
						break;
				case 2: Address address=per.getAddr();
						int press=1;
						while(press==1){
						System.out.println("Enter the details of address you want to change");
						System.out.println("1:Street  2:City  3:State  4:Zipcode");
						int ch=DataStructureUtility.userInteger();
						switch(ch){
						case 1: System.out.println("Enter the street");
								String newStreet=DataStructureUtility.userString();
								address.setStreet(newStreet);
								System.out.println("Your street is updated");
								break;
						case 2: System.out.println("Enter the city");
								String newCity=DataStructureUtility.userString();
								address.setCity(newCity);
								System.out.println("Your city is updated");
								break;
						case 3: System.out.println("Enter the state");
								String newState=DataStructureUtility.userString();
								address.setState(newState);
								System.out.println("Your state is updated");
								break;
						case 4: System.out.println("Enter the zipcode");
								long newZip=DataStructureUtility.userLong();
								address.setZipcode(newZip);
								System.out.println("Your zip code has been updated");
								break;
						default: System.exit(0);
						}
						System.out.println("Do you want to continue to change? if yes press 1 else 0");
						press=DataStructureUtility.userInteger();
						}
						per.setAddr(address);
						break;
						
				default:System.exit(0);
				}
				System.out.println("Do you want to continue editing? if yes press 1 else 0");
				edit=DataStructureUtility.userInteger();
				}
			}
		}
	}
	
	public static List<Person> getListOfPerson() {
		return listOfPerson;
	}

	public static void setListOfPerson(List<Person> listOfPerson) {
		AddressBook.listOfPerson = listOfPerson;
	}

	public void display(){
		if (listOfPerson==null) {
			System.out.println("There are No persons to display........");
		}
		else {
		for(Person p:listOfPerson){
			System.out.println("First Name: "+p.getFirstname());
			System.out.println("Last Name: "+p.getLastname());
			System.out.println("Contact Number: "+p.getPhonenumber());
			Address add=p.getAddr();
			System.out.println("Street: "+add.getStreet());
			System.out.println("City: "+add.getCity());
			System.out.println("State: "+add.getState());
			System.out.println("Zip code: "+add.getZipcode());
			System.out.println("-------------------------------------");
		}
		}
	}
	
	public void deletePerson(){
		System.out.println("Enter the details of person to delete");
		System.out.println("Enter first name");
		String firstName=DataStructureUtility.userString();
		System.out.println("Enter last name");
		String lastName=DataStructureUtility.userString();
		if(!listOfPerson.isEmpty()){
			for(Person per:listOfPerson){
				if(firstName.equals(per.getFirstname()) && lastName.equals(per.getLastname())){
					listOfPerson.remove(per);
					System.out.println("The person has been deleted");
					break;
				}
			}
		}		
	}
	
	public void sortByLastName(){
		Collections.sort(listOfPerson,(person1,person2)->person1.getLastname().compareTo(person2.getLastname()));
	}
	
	public void sortByZipCode(){
		Collections.sort(listOfPerson,(person1,person2)->
				person1.getAddr().getZipcode()>person2.getAddr().getZipcode()?1:
					person1.getAddr().getZipcode()<person2.getAddr().getZipcode()?-1:
						person1.getAddr().getZipcode()==person2.getAddr().getZipcode()?0:-10);
		
	}
	    }



