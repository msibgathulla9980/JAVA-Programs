package com.bridgelabz.utility;

import java.util.Scanner;

import com.bridgelabz.functionalprograms.Stopwatch;

import java.util.Arrays;
import java.util.Random;

public class FunctionalUtility<E> {
	////////////////////////////
	public void checkConcate(String s) {
		if (s.length() < 3)
			System.out.println("Enter the name with atleast 3 characters");
		else
			System.out.println("Hi, " + s + " How are you?");

	}
	////////////////////////////////////
	public void getCount(int count) {
		int head = 0, tail = 0;
		int c = count;
		Random r = new Random();
		while (count != 0) {
			double rn = r.nextDouble();
			if (rn > 0.5) {
				head++;
			} else {
				tail++;
			}
			count--;
		}
		System.out.println("perc of Head" + head * 100 / c);
		System.out.println("perc of Tail" + tail * 100 / c);
	}
	///////////////////////////////////////
	public void getLeap(int x) {
		if (x % 4 == 0 || x % 400 == 0 && x % 100 == 0) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("It is not leap year");
		}
	}
	//////////////////////////////////////
	public double getHarmonicNumber(int n) {
		double sum = 0.0;
		if (n == 1)
			return 1;
		else {
			for (double i = 1; i <= n; i++) {
				sum = sum + (1 / i);
			}
			return sum;
		}
	}
	////////////////////////////////
	public void getPrime() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n % 2 == 0) {
			System.out.println(2);
			n = n / 2;
		}
		for (int i = 3; i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i);
				n = n / i;
			}
			if (n > 2)
				System.out.println(n);

		}
	}
	/////////////////////////////////////
	public void Gambler() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stake:");
		int stake = sc.nextInt();
		System.out.println("Enter the Goal:");
		int goal = sc.nextInt();
		System.out.println("Enter the no of times to gamble:");
		int no_of_times = sc.nextInt();
		int win = 0, loose = 0;
		for (int i = 1; i <= no_of_times; i++) {
			double r = Math.random();
			int cash = stake;
			while (cash > 0 && cash < goal) {
				if (r < 0.5)

					cash--;
				else
					cash++;

			}
			if (cash == goal)
				win++;
			else
				loose++;
		}
		System.out.println(win + "wins of" + no_of_times);
		System.out.println("Percent Of Games Won:" + 100 * win / no_of_times);
		System.out.println("Percent Of Games lost:" + 100 * loose / no_of_times);

	}
	////////////////////////////////////
	public int getcouponNumber(int n) {
		boolean[] isCollected = new boolean[n];
		int count = 0;
		int distinct = 0;
		while (distinct < n) {
			Random r = new Random();
			int value = r.nextInt(n);
			count++;
			if (isCollected[value] == false) {
				distinct++;
				System.out.println(distinct);
				isCollected[value] = true;
			}
		}
		return count;
	}

	public void displayarray(E[][] garray,int m,int n) 
	{ for(int i=0;i<m;i++)
	{ for(int j=0;j<n;j++)
	{ 
		System.out.print(garray[i][j]+"");

	}
	System.out.println();}

	}

	//////////////////////////////////
	public void Triplet(int[] arr, int n) {
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println("true");
						flag=true;
					}
				}

			}
		}
		if(flag==false)
		{
			System.out.println("false");
		}
	}
	////////////////////////////////
	public void Distance(){
		int x,y;

		double dis;

		Scanner sc=new Scanner(System.in);

		System.out.println("enter x point");

		x=sc.nextInt();

		System.out.println("enter y point");

		y=sc.nextInt();

		dis=Math.sqrt(x*x+y*y);
		System.out.println("distancebetween"+"("+x+","+y+")="+dis);
	}
	///////////////////////////////
	public void combString(String s) {
		char[] a = new char[s.length()];
		//String temp = "";
		for(int i = 0; i < s.length(); i++) {
			a[i] = s.charAt(i);
		}
		for(int i = 0; i < s.length(); i++) {
			String temp = "" + a[i];    

			for(int j = 0; j < s.length();j++) {
				//int k = j;
				if(i != j) {
					System.out.println(j);
					temp += s.substring(0,j) + s.substring(j+1,s.length());
				}               
			}
			System.out.println(temp);
		}
	}
	/////////////////////////////////////
	long starttime=0;
	long endtime=0;
	long elapsedtime=0;


	public void start(){
		starttime= System.currentTimeMillis();
		System.out.println("Start time "+starttime);
	}
	public void end(){
		endtime=System.currentTimeMillis();
		System.out.println("End time " +endtime);
	}
	public void elapse(){
		elapsedtime=endtime-starttime;
		System.out.println("Elapsed time ="+elapsedtime);
	}
	////////////////////////////////////
	public void quadratic()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		System.out.println("Enter the value of c:");
		int c=sc.nextInt();

		double delta;
		delta=b*b-4*a*c;
		double rootx1=(-b+Math.sqrt(delta))/(2*a);
		double rootx2=(-b-Math.sqrt(delta))/(2*a);

		System.out.println("Root of x1 :"+rootx1);
		System.out.println("Root of x2 :"+rootx2);

	}
	/////////////////////////////	
	public void windChill()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of t in Fahrenheit:");
		double t=sc.nextDouble();
		System.out.println("Enter tMathhe value of v in miles/hr:");
		double v=sc.nextDouble();
		double w= 35.74+0.6215*t+(0.4275-35.75)*Math.pow(v,0.16);

		if (t>50||v>120&&v<3)
			System.out.println("The entered values are not valid, Please enter the values of t<50 and V between 2 and 120 ");
		else
			System.out.println("The Effective Temperature is"+w);
	}
	}
	/////////////////////////////////