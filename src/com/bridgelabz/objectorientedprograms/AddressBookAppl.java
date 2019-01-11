package com.bridgelabz.objectorientedprograms;
import com.bridgelabz.utility.*;
public class AddressBookAppl {

	public static void main(String[] args) {
		int t=0;
		AddressBook a=new AddressBook();
		do{
			System.out.println("Press\t1.ToAdd\t2.ToDisplay\t3.ToEdit\t4.Todelete\t5.To Sort ");
			System.out.println("Enter your Choice:");
			int ch=DataStructureUtility.userInteger(); 
			switch(ch)
			{
			case 1: 
				a.addPerson();
				break;
			case 2: 
				a.displayAddress();
				break;
			case 3: 
				a.editPerson();
				break;
			case 4: a.deletePerson();
			case 5: System.out.println("1. Sort by Lastname 2. sort by Zipcode");
			System.out.println("Enter your Choice:");
			int ch1 = DataStructureUtility.userInteger();

			switch(ch1){
			case 1: System.out.println("Press 2 to display the address book after sorting by Last Name ");
			a.sortByLastName();
			break;
			case 2:System.out.println("Press 2 to display the address book after sorting by Zipcode: ");
			a.sortByZipCode();
		
			}//end of inside switch
			
			
		default:
			System.out.println("Please enter the appropriate choice");
            break;
			}//end of outside switch
	}while(t<20);
	
}

}
