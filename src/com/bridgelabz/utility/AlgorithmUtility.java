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
	public void binSrcFile() throws FileNotFoundException{
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

	//Binary Search
	public void Binsrcforint(int[] inputArr, int key) {
		int low = 0;
		int high = inputArr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == inputArr[mid]) {
				System.out.println("Element is found at index" +mid);
			}
			if (key < inputArr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		System.out.println("Element not found");

	}

	///Binary Search for string

	public void binarySearchforstr(String[] a, String x) {
		int low = 0;
		int high = a.length - 1;
		int mid; 
		mid = (low + high) / 2;

		while (low <= high) {

			if (a[mid].compareToIgnoreCase(x) < 0) {
				low = mid + 1;
				System.out.println("Element is found at index" +low);
			} else if (a[mid].compareToIgnoreCase(x) > 0) {
				high = mid - 1;
				System.out.println("Element is found at index" +high);
			} else {
				System.out.println("Element is found at index" +mid);
			}
			break;
		}
		mid = (low + high) / 2;


	}


	/**
	 * @param arr
	 * @param n
	 */
	public void insertionSort(int arr[],int n)
	{
		int key;
		for(int i=1;i<n;i++)
		{
			key=arr[i];
			int j=i-1;
			while(j>=0 && (arr[j]>key))
			{
				arr[j+1]=arr[j];
				j=j-1;//j--

				arr[j+1]=key;
			}
		}
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[j]);
			System.out.println(" ");
		}
	}



	public void bubbleSort(int arr[], int n)
	{

		for (int i =0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}


		/* Prints the array */

		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	//Merges two subarrays of arr[]. 
	// First subarray is arr[l..m] 
	// Second subarray is arr[m+1..r] 
	public static void mergeForstring(String arr[],int n) 
	{ 
	}

	// Merges two subarrays of arr[]. 
	// First subarray is arr[l..m] 
	// Second subarray is arr[m+1..r] 
	static void merge(String arr[], int l, int m, int r) 
	{ 
		// Find sizes of two subarrays to be merged 
		int n1 = m - l + 1; 
		int n2 = r - m; 

		/* Create temp arrays */
		String L[] = new String [n1]; 
		String R[] = new String [n2]; 

		/*Copy data to temp arrays*/
		for (int i=0; i<n1; ++i) 
			L[i] = arr[l + i]; 
		for (int j=0; j<n2; ++j) 
			R[j] = arr[m + 1+ j]; 


		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays 
		int i = 0, j = 0; 

		// Initial index of merged subarry array 
		int k = l; 
		while (i < n1 && j < n2) 
		{ 
			if (L[i].compareToIgnoreCase(R[j])<=0) 
			{ 
				arr[k] = L[i]; 
				i++; 
			} 
			else
			{ 
				arr[k] = R[j]; 
				j++; 
			} 
			k++; 
		} 

		/* Copy remaining elements of L[] if any */
		while (i < n1) 
		{ 
			arr[k] = L[i]; 
			i++; 
			k++; 
		} 

		/* Copy remaining elements of R[] if any */
		while (j < n2) 
		{ 
			arr[k] = R[j]; 
			j++; 
			k++; 
		} 
	} 

	// Main function that sorts arr[l..r] using 
	// merge() 
	public static void sort(String arr[], int l, int r) 
	{ 
		if (l < r) 
		{ 
			// Find the middle point 
			int m = (l+r)/2; 

			// Sort first and second halves 
			sort(arr, l, m); 
			sort(arr , m+1, r); 

			// Merge the sorted halves 
			merge(arr, l, m, r); 
		} 
	} 

	/* A utility function to print array of size n */
	public static void printArray(String arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 
	// Driver method 
	/* Purpose: Takes a numbers (N), asks you to think of a number between 0 and N-1, where N = 2^n, and always guesses the answer with n questions.
	 */
	

	
		static int range,count,lower,upper,middle;
		static String input;

		public  static void binarySearch(int lower,int upper,int middle,int count,String input,int n)
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Is your number:"+middle);
			System.out.println();
			System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
			input=sc.nextLine();
			
			do
			{
				if (input.equals("high"))
				{
					lower= middle;
					count++;
				}
				else if (input.equals("yes"))
				{
					System.out.println("The number you thought was: "+middle);
					int no=count+1;
					System.out.println("It takes "+no+" times to find your exact number");
					break;
				}
				else if(input.equals("low"))
				{
					upper=middle;
					count++;
				}
				if(count<n)
				{
					middle=(lower+ upper+1)/2;
					System.out.println("Is your number "+middle+":");
					input=sc.nextLine();
				}
			}
			while(lower<=upper);
			if (count>n)
			{
				System.out.println("Number not found");
			}
			else
			{
				System.exit(0);
			}

	}
}









