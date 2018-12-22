package com.bridgelabz.utility;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class AlgorithmUtility {
	/////////////////////////////////////////
	public void Anagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			System.out.println("Str1 and Str2 are not Anagrams");
		}
		char[] char1 = str1.toLowerCase().toCharArray();
		char[] char2 = str2.toLowerCase().toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		if (char1 == char2) {
			System.out.println("Str1 and Str2 are Anagrams");
		} else {
			System.out.println("Str1 and Str2 are not Anagrams");
		}

	}

	//////////////////////////////////
	public void Prime() {
		for (int i = 1; i <= 1000; i++) {

			int flag = 1;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;

				}
			}
			if (flag == 1) {
				System.out.println(i);
			}
		}

	}

	////////////////////////////
	public void src() throws FileNotFoundException{
		String word = ""; int val = 0;
		while(!word.matches("quit"))
		{
			System.out.println("Enter the word to be searched for");
			Scanner input = new Scanner(System.in);
			word = input.next();
			File file = new File("C:\\Users\\Mohammed Sibgath\\Desktop\\newFile.txt"); 

			Scanner sc = new Scanner(file); 

			while(sc.hasNextLine())           
			{
				String line = sc.nextLine();
				if(line.indexOf(word) != -1)
				{
					System.out.println("Word EXISTS in the file");
					val = 1;
					break;
				}
				else
				{
					val = 0;
					continue;
				}
			}
			if(val == 0)
			{
				System.out.println("Word does not exist");
			}
			System.out.println("-------continue or quit--- enter continue or quit");
			word = input.next();        
		}  
	}

	public void vendingMachine(){


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount in Rupees : ") ; 
		int rs=sc.nextInt();
		while( rs >= 1000) 
		{ 
			int a = rs / 1000 ; 
			rs = rs % 1000;
			System.out.println("\nThe no. of Thousands are :" +a) ; 
			break ; 
		} 
		while( rs >= 500) 
		{ 
			int a = rs / 500 ; 
			rs = rs % 500;
			System.out.println("\nThe no. of five hundreds are :" +a) ; 
			break ; 
		} 
		while( rs >= 100) 
		{ 
			int b = rs / 100 ; 
			rs = rs % 100;
			System.out.println("The no. of hundreds are :" +b) ; 
			break ; 
		} 
		while(rs >= 50) 
		{ 
			int c = rs / 50 ;
			rs = rs % 50; 
			System.out.println("The no. of fifties are :" +c) ; 
			break ; 
		} 
		while(rs >= 20) 
		{ 
			int d = rs / 20 ; 
			rs = rs % 20;
			System.out.println("The no. of twenties are : " +d) ; 
			break ; 
		} 
		while(rs >= 10) 
		{ 
			int e = rs / 10 ; 
			rs = rs % 10;
			System.out.println("The no. of tens are : " +e) ; 
			break ; 
		} 
		while(rs >= 5) 
		{ 
			int f = rs / 5 ; 
			rs = rs % 5;
			System.out.println("The no. of fives are : " +f) ; 
			break ; 
		} 
		while(rs >= 2) 
		{ 
			int g = rs / 2 ; 
			rs = rs % 2;
			System.out.println("The no. of Twos are : " +g) ; 
			break ; 
		} 
		while(rs >= 1) 
		{ 
			int h = rs / 1 ; 
			rs = rs % 1;
			System.out.println("The no. of ones are : " +h) ; 
			break ; 
		} 

	}
	public void dayofweek(){


		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("Enter The Month");
			int m = scanner.nextInt();
			if (m < 1 || m > 12) {
				System.out.println("Months are between 1 and 12");
				break;
			}

			System.out.println("Enter The Day");
			int d = scanner.nextInt();
			if (d < 1 || d > 31) {
				System.out.println("Days are between 1 and 31");
				break;
			}

			System.out.println("Enter The Year");
			int y = scanner.nextInt();
			if (y < -10000 || y > 10000) {
				System.out.println("Years are between -10000 and 10000");
				break;
			}

			int y0 = y - (14 - m) / 12;
			int x = y0 + y0/4 - y0/100 +y0/400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + 31 * m0 / 12) % 7;  
			while(d0<7){

				switch(d0){
				case 0:
					System.out.println("The day of the week is Sunday");
					break;
				case 1:	
					System.out.println("The day of the week is Monday");
					break;
				case 2:
					System.out.println("The day of the week is Tuesday");
					break;
				case 3:
					System.out.println("The day of the week is Wednesday");
					break;
				case 4:
					System.out.println("The day of the week is Thursday");
					break;
				case 5:
					System.out.println("The day of the week is Friday");
					break;
				case 6:
					System.out.println("The day of the week is Saturday");
					break;
				default:
					System.out.println("Invalid input");
				}
				break;
			}
		}
	}
	public void temperatureConversion(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Temperature In Fahrenheit: ");
		double f=sc.nextDouble();
		double ftoc=(f-32)*5/9;
		System.out.println("The temperature in Celsius is "+ftoc);
		System.out.println("Enter the Temperature In Celsius: ");
		double c=sc.nextDouble();
		double ctof=(c*9/5)+32;
		System.out.println("The temperature in Fahrenheit is "+ctof);
	}
	public void monthlyPayment(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Principal Amount: ");
		double p=sc.nextDouble();
		System.out.println("Enter The Number Of Years: ");
		int y=sc.nextInt();
		System.out.println("Enter The Percentge Of Interest: ");
		double R=sc.nextDouble();
		int n=12*y;
		double r=R/(12*100);
		double payment;
		payment=p*r/(1-Math.pow(1+r, -n));
		System.out.println("The Monthly Payment is: " +payment);

	}

	public void sqrt(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Value to find the sqrtroot: ");
		int c=sc.nextInt();
		double t=c;
		double epsilon=1e-15;
		while((Math.abs(t - (c/t)) > epsilon*t)){
			t=((c/t)+t)/2;
		}
		System.out.println("The sqrt is : "+t);

	}
	public void toBinary(){
		int i=0;
		int[] bin=new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any decimal number:");
		int n = sc.nextInt();
		while(n > 0)
		{
			bin[i] = n % 2;
			n = n / 2;
			i++;
		}
		for (int j=i-1;j>=0;j--){
			System.out.println(bin[j]);
		}
	}

	public void Binsrcforint(int a[], int key){
		int low=0,high=a.length;
		int mid=0;
		while(low<=high){
			 mid=(low+high)/2;
			if(a[mid]==key){
				System.out.println(mid);
				
			}
			 if(a[mid]<key)
			{
				low=mid+1;
			
			}
			else
			{
				high=mid-1;
			}
		}
		

	}
}
	/*public void binarySearchforstr(String[] a, String x) {
		int low = 0;
		int high = a.length - 1;
		int mid;

		while (low <= high) {
			mid = (low + high) / 2;

			if (a[mid].compareTo(x) < 0) {
				low = mid + 1;
			} else if (a[mid].compareTo(x) > 0) {
				high = mid - 1;
			} else {
				System.out.println("Element is found at index"+mid);
			}
		}
		mid = (low + high) / 2;


	}
	/*
	public void insertionSort(){
		int arr[],n = 0,key;
		for(int i=1;i<n;i++)
		{
			key=arr[i];
			int j=i-1;
			while( j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;

		}
	}*/








