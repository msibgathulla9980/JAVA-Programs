package com.bridgelabz.functionalprograms;
import java.util.Scanner;
import java.util.Random;

public class FunctionalUtility {

	public void checkConcate(String s) {
		if(s.length()<3)
			System.out.println("Enter the name with atleast 3 characters");
		else
			System.out.println("Hi, "+s+" How are you?");
		
	}
	
	public void getCount(int count)
	{
		int head=0,tail=0; int c=count;
		Random r=new Random();
		while(count!=0)
		{
			double rn=r.nextDouble();
			if (rn>0.5){
				head++;
			}
				else{
					tail++;
			}
			count--;
		}
			System.out.println("perc of Head"+ head*100/c);
			System.out.println("perc of Tail"+ tail*100/c);
		}
	public void getLeap(int x){
		if(x%4==0 || x%400==0 && x%100==0)
		{
System.out.println("It is a leap year");
		}
else
{
	System.out.println("It is not leap year");
	}
		}
}
	
