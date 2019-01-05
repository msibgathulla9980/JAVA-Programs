package com.bridgelabz.datastructureprograms;
import java.util.Scanner;
import com.bridgelabz.utility.*;
public class BankingCashCounter {
	public static void main(String args[])
	{ 
		Scanner sc= new Scanner(System.in);
		BankingCashCounterLogic q=new BankingCashCounterLogic();
		int ch = 0;
		do
		{ 
			System.out.println();
		   	System.out.println("*************Welcome To Bridge Labz Banking Cash Counter*************");
		   	System.out.println("Press 1 to Deposit");
		   	System.out.println("Press 2 to Withdraw");
		   	System.out.println("Press 3 to Display Number of people in the Queue ");
		   	System.out.println("Press 4 to Exit");
		   	System.out.println();
		   	System.out.println("Enter your choice: ");
		   	int choice=sc.nextInt();
		   	switch (choice) 
		   	{
		   	case 1:
			   		System.out.println("Enter the amount to be Deposited:");
			   		int d=sc.nextInt();
			   		q.insert(d); 
			   		q.display();
			   		break;
		   	case 2:
			   		System.out.println("Enter the amount to be Withdrawn: ");
					sc.nextInt();
			   		q.remove();
			   		System.out.println(" Your Available Balance is: "); 
			   		q.display();
			   		break;
			case 3:
					int j=q.getSize();
					System.out.println("The Number of People in the Queue are: "+j);			
		   	case 4:
			   		System.exit(0);
		   	default: 
			   		System.out.println("You've entered the wrong choice");
			   		break;
		   	}
	   	}
		while(ch<5);
	}		
}
