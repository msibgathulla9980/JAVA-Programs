package com.bridgelabz.datastructureprograms;
import java.util.Scanner;
import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class Calender2DArray {
	public static void main(String[] args) {
		int t=0;
		do{
		DataStructureUtility du=new DataStructureUtility();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Month:");
		int m = s.nextInt();
		System.out.println("Enter The Year:");
		int y = s.nextInt();
		FunctionalUtility fu=new FunctionalUtility();
		fu.isLeap(y);
		
		du.dispCalendar(m,y);
	}while(t<10);
	}
}