package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalUtility;
import java.util.Scanner;
public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the username");
Scanner s=new Scanner(System.in);
String str1="Hello ##username##,How are you?"; 
FunctionalUtility functionalUtility=new FunctionalUtility();
functionalUtility.replaceString(str1);
}

}
