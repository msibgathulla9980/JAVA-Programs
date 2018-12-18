package com.bridgelabz.util;
import java.util.Scanner;
import com.bridgelabz.functionalprograms.*;

public class FunctionalUtility {

	public void replaceString(String str1) {
		Scanner s=new Scanner(System.in);
		String usname=s.nextLine();
		if(usname.length()>=3)
		{
			String pString=str1.replace("##username##",usname);
			System.out.println(pString);
		}
		
		else{
			System.out.println("Enter more than 3 characters");
		}

	}

}
