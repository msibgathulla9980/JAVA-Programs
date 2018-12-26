package com.bridgelabz.utility;

import java.util.Scanner;

import com.bridgelabz.functionalprograms.Stopwatch;

import java.util.ArrayList;
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
		System.out.println("Enter the value of v in miles/hr:");
		double v=sc.nextDouble();
		double w= 35.74+0.6215*t+(0.4275-35.75)*Math.pow(v,0.16);

		if (t>50||v>120&&v<3)
			System.out.println("The entered values are not valid, Please enter the values of t<50 and V between 2 and 120 ");
		else
			System.out.println("The Effective Temperature is"+w);
	
	}
	/////////////////////////////////


static int player = 0;
static int[][] BOARD = new int[3][3];
static boolean isEmpty = true;

public static void initBoard() {
	System.out.println("TIC TAC TOE GAME\nComputer is o\nPlayer  is x ");
	for (int i = 0; i < BOARD.length; i++) {
		for (int j = 0; j < BOARD[i].length; j++) {
			BOARD[i][j] = -10;
		}
	}
	System.out.println("Board is this :");
	dispBoard();
}

public static void dispBoard() {
	int count = 0;
	for (int i = 0; i < BOARD.length; i++) {
		System.out.println("---------------");
		System.out.print("||");
		for (int j = 0; j < BOARD[i].length; j++) {
			if (BOARD[i][j] == 0) {
				count++;
				System.out.print(" o |");
			} else if (BOARD[i][j] == 1) {
				count++;
				System.out.print(" x |");
			} else
				System.out.print("   |");
		}
		System.out.println("|");
	}
	if (count == 9) {
		isEmpty = false;
	}
	System.out.println("---------------");
}
/*
 * static void putVal(int i, int j, int player) { if if (player % 2 == 0) {
 * BOARD[i][j] = 0; } else BOARD[i][j] = 1; }
 */

public static void putVal() {
	int i;
	int j;
	if (player % 2 == 1) {
		i = (int) (Math.random() * 10) % 3;
		j = (int) (Math.random() * 10) % 3;
	} else {
		Scanner s = new Scanner(System.in);
		System.out.println("enter value of x and y by space");
		i = s.nextInt();
		j = s.nextInt();
	}
	if (BOARD[i][j] == -10) {
		if (player % 2 == 0) {
			BOARD[i][j] = 0;
		} else {
			BOARD[i][j] = 1;
			System.out.println("Coumputer Choosing " + i + " " + j);
		}
	} else
		putVal();

}

public static boolean win() {
	return ((BOARD[0][0] + BOARD[0][1] + BOARD[0][2] == player * 3)
			|| (BOARD[1][0] + BOARD[1][1] + BOARD[1][2] == player * 3)
			|| (BOARD[2][0] + BOARD[2][1] + BOARD[2][2] == player * 3)
			|| (BOARD[0][0] + BOARD[1][0] + BOARD[2][0] == player * 3)
			|| (BOARD[0][1] + BOARD[1][1] + BOARD[2][1] == player * 3)
			|| (BOARD[0][2] + BOARD[1][2] + BOARD[2][2] == player * 3)
			|| (BOARD[0][0] + BOARD[1][1] + BOARD[2][2] == player * 3)
			|| (BOARD[2][0] + BOARD[1][1] + BOARD[0][2] == player * 3));
}

public static void play() {
	initBoard();
	while (isEmpty) {
		System.out.println("Players turn");
		putVal();
		dispBoard();
		if (win()) {
			System.out.println("Player won");
			return;
		}
		player = 1;
		System.out.println("Computers turn");
		putVal();
		dispBoard();
		if (win()) {
			System.out.println("Computer won");
			return;
		}
		player = 0;
	}
}
public static String[] permutIteration(String s2) {
	ArrayList<String> arl = new ArrayList<>();
	for (int i = 0; i < s2.length(); i++) {
		for (int j = 0; j < s2.length(); j++) {
			String s1 = s2;
			System.out.println(i + " " + j);
			System.out.println(swap(s1, i, j));
			// arl.add(swap(s1, i, j));
		}
	}
	return arl.toArray(new String[arl.size()]);
}

public static String swap(String s1, int i, int j) {

	char[] ch = s1.toCharArray();
	char temp;
	temp = ch[i];
	ch[i] = ch[j];
	ch[j] = temp;
	return new String(ch);
}

/**
 * Function helping prime() to check if prime is pallindrome and print it
 */
public static void primePallindrome() {
	System.out.println();
	boolean b;
	for (int j = 2; j <= 1000; j++) {
		b = true;
		for (int i = 2; i < j / 2; i++) {
			if (j % i == 0) {
				b = false;
				break;
			}
		}
		if (b && isPallindrome(j))
			System.out.print(j + " ");
	}
}

/**
 * Function to check if no is anagram or not
 */
public static void primeAnagrams() {
	ArrayList<Integer> ar = new ArrayList<Integer>();
	System.out.println();
	boolean b;
	for (int j = 2; j <= 1000; j++) {
		b = true;
		for (int i = 2; i < j / 2; i++) {
			if (j % i == 0) {
				b = false;
				break;
			}
		}
		if (b)
			ar.add(j);
	}
	for (int i = 0; i < ar.size(); i++) {
		for (int j = i + 1; j < ar.size(); j++) {
			if (anagram(ar.get(i), ar.get(j))) {
				System.out.println(ar.get(i) + "  " + ar.get(j));
			}
		}
	}
}
/**
 * Function to find the is pallindrome or not
 * 
 * @param n the integer which to check for pallindrome
 * @return true if its pallindrome or false if its not
 */
public static boolean isPallindrome(int n) {
	int temp = n;
	int sum = 0;
	while (temp != 0) {
		int r = temp % 10;
		sum = sum * 10 + r;
		temp = temp / 10;
	}
	if (sum == n) {
		return true;
	}
	return false;
}
/**
 * to check the values are anagrams or not
 * 
 * @param n1
 * @param n2
 * @return
 */
public static boolean anagram(int n1, int n2) {
	int[] n1count = count(n1);
	int[] n2count = count(n2);
	for (int i = 0; i < n2count.length; i++) {
		if (n1count[i] != n2count[i]) {
			return false;
		}
	}
	return true;
}
/**
 * Function to count the value in given integer be place
 * 
 * @param n the integer value to count
 * @return the integer array for the count value
 */
public static int[] count(int n) {
	int[] count = new int[10];
	int temp = n;
	while (temp != 0) {
		int r = temp % 10;
		count[r]++;
		temp = temp / 10;
	}
	return count;
}
/**
 * function to check if given no is prime or not
 * 
 * @param n thenumber which to check for prime
 * @return true if prime false if not
 */
public static boolean isPrime() {
	int n =1000;
	for (int i = 2; i < n / 2; i++) {
		if (i % n == 0) {
			return false;
		}
	}
	return true;
}
}