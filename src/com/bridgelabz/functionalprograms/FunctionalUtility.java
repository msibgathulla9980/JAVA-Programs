package com.bridgelabz.functionalprograms;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class FunctionalUtility
{

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

	public double getHarmonicNumber(int n)
	{
		double sum=0.0; 
		if (n==1)
			return 1;
		else{
			for (double i=1;i<=n;i++)
			{
				sum = sum + (1/i);
			}
			return sum;
		}
	}
	public void getPrime()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n%2==0){
			System.out.println(2);
			n=n/2;
		}
		for(int i=3;i<=n;i++)
		{
			while(n%i==0){
				System.out.print(i);
				n=n/i;
			}
			if (n>2)
				System.out.println(n);


		}
	}
	public void Gambler()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the stake:");
		int stake=sc.nextInt();
		System.out.println("Enter the Goal:");
		int goal=sc.nextInt();
		System.out.println("Enter the no of times to gamble:");
		int no_of_times=sc.nextInt();
		int win=0,loose=0;
		for (int i=1;i<=no_of_times;i++){
			double r=Math.random();
			int cash=stake;
			while(cash>0&&cash<goal)
			{
				if (r<0.5)

					cash--;
				else
					cash++;

			}
			if (cash==goal)
				win++;
			else
				loose++;
		}
		System.out.println(win+ "wins of" +no_of_times);
		System.out.println("Percent Of Games Won:"+100*win/no_of_times);
		System.out.println("Percent Of Games lost:"+100*loose/no_of_times);


	}

	public int getcouponNumber(int n) {
		boolean[] isCollected=new boolean[n];
		int count=0;
		int distinct=0;
		while(distinct<n)
		{
			Random r=new Random();
			int value=r.nextInt(n);
			count++;
			if(isCollected[value]==false)
			{
				distinct++;
				System.out.println(distinct);
				isCollected[value]=true;
			}
		}
		return count;
	}
	/*public void displayarray(E[][] garray,int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(garray[i][j]+" ");
			}

	}	

	}*/

	public void findTriplets(int[] arr,int n, int sum)
	{
		
		// A simple Java program  
		// to find three elements 
		// whose sum is equal to  
		// given sum 

		// function to print  
		// triplets with given sum 

		// sort array elements 
		Arrays.sort(arr); 

		for (int i = 0; i < n - 1; i++)  
		{ 
			// initialize left and right 
			int l = i + 1; 
			int r = n - 1; 
			int x = arr[i]; 
			while (l < r)  
			{ 
				if (x + arr[l] + arr[r] == sum)  
				 
				{// print elements if it's  
					// sum is given sum. 
					System.out.println(x + " " + arr[l] +  " " + arr[r]); 
					l++;
					r--; 
			}
			}
		}
	}
}