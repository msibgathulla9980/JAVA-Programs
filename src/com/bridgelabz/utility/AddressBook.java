package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AddressBook {

	List<Person> listofperson=new ArrayList<Person>();//creating a person list
	Person person=null;//creating an object of person class

	public void addPerson()
	{
		 person=new Person();
		System.out.println("Enter The First Name:");
		person.setFirstname(DataStructureUtility.userString());
		System.out.println("Enter The Last Name");
		person.setLastname(DataStructureUtility.userString());
		System.out.println("Enter the Phone Number:");
		person.setPhonenumber(DataStructureUtility.userLong());
		Address addr=new Address();//Creating an object of address class
		System.out.println("Enter the Street:");
		addr.setStreet(DataStructureUtility.userString());
		System.out.println("Enter the City:");
		addr.setCity(DataStructureUtility.userString());
		System.out.println("Enter the State:");
		addr.setState(DataStructureUtility.userString());
		System.out.println("Enter the ZipCode:");
		addr.setZipcode(DataStructureUtility.userLong());
		System.out.println("The Details Entered are added successfully");
		person.setAddr(addr);
		listofperson.add(person);
	}

	public void editPerson()
	{
		System.out.println("Enter the Person Whose Details needs to be changed");
		System.out.println("Enter the First Name:");
		String fname=DataStructureUtility.userString();
		System.out.println("Enter the Last Name:");
		String lname=DataStructureUtility.userString();
		int flag=0;
		for(int i=0;i<listofperson.size();i++)
		{
		if (fname.contains(person.getFirstname())&& lname.contains(person.getLastname()))
		{
		
			System.out.println(i);
			
				System.out.println("Choose which details you want to edit:");
				System.out.println(" 1.PhoneNumber \n 2. Address\n 3.End ");
				int ch =DataStructureUtility.userInteger();
				switch(ch){
				case 1: System.out.println("Enter the Phone Number to Update:");
				person.setPhonenumber(DataStructureUtility.userLong());
				System.out.println("Phone Number Updated.");
				break;
				case 2: Address addr=person.getAddr();
				System.out.println("Choose the option to edit the address\n 1.Street\n 2.City\n 3.State\n 4.ZipCode\n");
				int choice=DataStructureUtility.userInteger();
				switch(choice)
				{
				case 1:System.out.println("Enter the New Street Details:");
				addr.setStreet(DataStructureUtility.userString());
				System.out.println("Street Details updated");
				break;
				case 2:System.out.println("Enter the New City :");
				addr.setCity(DataStructureUtility.userString());
				System.out.println("City Details updated");
				break;
				case 3:System.out.println("Enter the New State:");
				addr.setState(DataStructureUtility.userString());
				System.out.println("State Details updated");
				break;
				case 4:System.out.println("Enter the New ZipCode :");
				addr.setZipcode(DataStructureUtility.userLong());
				System.out.println("State Details updated");
				break;
				default:System.out.println("Enter the Correct Choice:");
				}//ending the inside switch
				person.setAddr(addr);
				default:System.out.println("Press 1 to continue\n 0 to exit:");
				System.exit(0);

				}//end of outside switch
			}//end of if
			flag=1;
	}
		if (flag==0)
		{
			System.out.println("The Entered details didn't match or empty, Please proceed further");
		}//end of for
}//end of edit person method. 
	   public void displayAddress() {
		   if (!listofperson.isEmpty())
		   {
		   System.out.println("The Details Entered are:");
	        for (Person per2 : listofperson) {
	            System.out.println("First name : " + per2.getFirstname());
	            System.out.println("Last name : " + per2.getLastname());
	            System.out.println("Phone number : " + per2.getPhonenumber());
	            Address addr = per2.getAddr();
	            System.out.println("Address :\n");
	            System.out.println("Street : " + addr.getStreet());
	            System.out.println("City : " + addr.getCity());
	            System.out.println("State : " + addr.getState());
	            System.out.println("Zip Code : " + addr.getZipcode());
	            System.out.println("--------------------------------------");
	        }
		   }
		   else
		   {
			   System.out.println("Address book is Empty, There's Nothing to display.");
		   }
	    }

	    public void deletePerson() {
	        System.out.println("Enter the first name of the person which has to be deleted");
	        String fName = DataStructureUtility.userString();
	        System.out.println("Enter the last name of the person which has to be deleted");
	        String lName = DataStructureUtility.userString();
	        int flag=0;
	        try{
	        for (Person per : listofperson) {
	            if (fName.equals(per.getFirstname()) && lName.equals(per.getLastname())) {
	                listofperson.remove(per);
	                System.out.println("Person removed from the address book ");
	            }
	            flag=1;
	        }
	        if (flag == 0) {
	            System.out.println("Entered first name and last name does not exist in address book");
	        }
	        
	     
	    }
	        catch (Exception e)
	        {
	        	System.out.println();
	        }
	        }
	
	    public void sortByLastName(){
	    	Collections.sort(listofperson,(person1,person2)->person1.getLastname().compareTo(person2.getLastname()));
	    		    }
	    public void sortByZipCode(){
			Collections.sort(listofperson,(person1,person2)->
					person1.getAddr().getZipcode()>person2.getAddr().getZipcode()?1:
						person1.getAddr().getZipcode()<person2.getAddr().getZipcode()?-1:
							person1.getAddr().getZipcode()==person2.getAddr().getZipcode()?0:-10);
			
		}
	    	
	    }



