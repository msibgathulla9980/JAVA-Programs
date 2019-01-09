package com.bridgelabz.objectorientedprograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;
import com.bridgelabz.utility.UserDetails;
import com.bridgelabz.utility.*;
import com.bridgelabz.utility.UtilityRegex;

public class Regex
{
	public static void main(String args[]) throws FileNotFoundException
	{
		UtilityRegex u=new UtilityRegex();

		UserDetails user=new UserDetails();
	
		//asking user to enter his data
		System.out.println("Enter FirstName:");
		user.setfName(u.inputString());
		System.out.println();
	
		System.out.println("Enter LastName:");
		user.setlName(u.inputString());
		System.out.println();
	
		System.out.println("Enter Mobile Number:");
		user.setmobileNo(u.inputString());
		System.out.println();	
		
		//Setting current date
				user.setdate(u.getFormatedDate(new Date()));
				System.out.println(u.convertString(user,u.getFileText("C:\\Users\\Mohammed Sibgath\\Desktop\\newFile.txt")));
	}
}
