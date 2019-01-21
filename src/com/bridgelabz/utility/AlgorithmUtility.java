package com.bridgelabz.utility;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AlgorithmUtility<E> {
	/////////////////////////////////////////
	/**
	 * Function to check the two strings are anagrams or not
	 * 
	 * @param s1 the first string to check
	 * @param s2 the second string to check
	 * @return true if its string and vice-versa
	 */
	public static boolean anagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		int[] s1count = count(s1);
		int[] s2count = count(s2);
		for (int i = 0; i < s2count.length; i++) {
			if (s2count[i] != s1count[i]) {
				return false;
			}
		}
		return true;
	}
	//Function to check Anagram for the given two strings.
	public static boolean isAnagram(String word, String anagram) {
        boolean isAnagram = false;
        if (word != null && anagram != null && word.length() == anagram.length()) {
            char[] arr = word.toCharArray();
            StringBuilder temp = new StringBuilder(anagram);
            //int wordLength = FunctionalUtility.readInteger();
            for (char ch : arr) {
                int index = temp.indexOf("" + ch);
                if (index != -1) {
                    temp.deleteCharAt(index);
                }
            }
            isAnagram = temp.toString().isEmpty();
        }
        return isAnagram;
    }

	/**
	 * Function to count the characters in a string alphabaticlally and return array
	 * of the count of each alphabet
	 * 
	 * @param s the string given to count
	 * @return the array for counted characters
	 */
	public static int[] count(String s) {
		s = s.toLowerCase();
		int[] c = new int[25];
		for (int i = 0; i < s.length(); i++) {
			c[s.charAt(i) - 97]++;
		}
		return c;
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

	//////////////////////////////////Function to compute prime numbers
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

	////////////////////////////Function to search using File input
	public void binSrcFile() throws FileNotFoundException{
		String word = ""; int val = 0;
		while(!word.matches("quit"))
		{
			System.out.println("Enter the word to be searched for");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			word = input.next();
			File file = new File("C:\\Users\\Mohammed Sibgath\\Desktop\\newFile.txt"); 

			@SuppressWarnings("resource")
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

	/**
	 * 
	 */
	public static void vendingMachine(){


		@SuppressWarnings("resource")
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
	/**
	 * Function to compute the DayOfTheWeek
	 * @param m month
	 * @param d day
	 * @param y year
	 * @return
	 */
	public static int dayofweek(int m,int d, int y){


		
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0/4 - y0/100 +y0/400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + 31 * m0 / 12) % 7;  
			return d0;
		}
		
	//Function to Compute Temperature conversion
	public void temperatureConversion(){
		@SuppressWarnings("resource")
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
	//Function To Compute Monthly Payment
	public void monthlyPayment(){
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Principal Amount: ");
		double p=sc.nextDouble();
		System.out.println("Enter The Number Of Years: ");
		double y=sc.nextDouble();
		System.out.println("Enter The Percentge Of Interest: ");
		double R=sc.nextDouble();
		double n=12*y;
		double r=R/(12*100);
		double payment;
		payment=p*r/(1-Math.pow(1+r, -n));
		System.out.println("The Monthly Payment is: " +payment);

	}
//Function To Compute The Square Root
	public static void sqrt(){
		@SuppressWarnings("resource")
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
	//Function that converts from decimal to Binary
	public static void toBinary(){
		int i=0;
		int[] bin=new int[100];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number:");
		int n = sc.nextInt();
		while(n > 0)
		{
			bin[i] = n % 2;
			n = n / 2;
			i++;
		}
		System.out.println("The Number in Binary is: ");
		for (int j=7;j>=0;j--){
			System.out.println(bin[j]);
		
		}
	}

	//Binary Search function
	public void Binsrcforint(int[] inputArr, int key) {
		int low = 0;
		int high = inputArr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
	
			if (key == inputArr[mid]) {
				System.out.println("Element is found at index" +mid);
			}
			else{
				System.out.println("Element not found");
				break;
				}
			if (key < inputArr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

	}

	///Binary Search Method for string

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
	 * Function To compute Insertion Sort 
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
			
			@SuppressWarnings("resource")
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



//Function to Swap the Nibbles from left and from Right
public static int swapNibbles(int x) 
{ 
return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
} 



	//Function to Check Whether the Swapped Nibble in Decimal Is a Power Of Two.
	public static boolean isPowerOfTwo(int number) {

	    if (number % 2 != 0) {
	      return false;
	    } else {

	      for (int i = 0; i <= number; i++) {

	        if (Math.pow(2, i) == number) return true;
	      }
	    }
	    return false;
	  }

    
    
 //Function to converts swapped nibble to binary 
public static void toBinaryfornibble(int n){
	int i=0;
	int[] bin=new int[100];
	while(n > 0)
	{
		bin[i] = n % 2;
		n = n / 2;
		i++;
	}
	System.out.println("The Swapped Nibble in Binary is: ");
	for (int j=7;j>=1;j--){
		System.out.print(+bin[j]);
		
	}
	System.out.println();
}
static int i;
static int j;
public static boolean PrimeFirst(int num){
	int temp;
	boolean isPrime=true;
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	return isPrime;
	
   }
static Scanner scanner=new Scanner(System.in);
public static int userInteger()
{
	
		return scanner.nextInt();

	
}

//for timer start and stop
public static double startTimerFunc()
{
  double d=System.nanoTime();
  return d;
}
public static double stopTimerFunc()
{
  double d1=System.nanoTime();
  return d1;
}
public static double elapsedTime(double stopTime,double startTime)
{
  
  double timeElapsed=stopTime-startTime;
  return timeElapsed;
}
public static List<Double> listCall(List<Double> timeList)
{
	Collections.sort(timeList);    
 return timeList;
}



public static Map<String,Double> mapCall(Map<String,Double> map)
{
  Map<String, Double> sortedMap = new LinkedHashMap<>();
   map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
   .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
   return sortedMap;
}



////
//insertion sort
public static void insertionSort(String array[], int f)
{
  String temp="";
  for(int i=0;i<f;i++)
  {
      for(int j=i+1;j<f;j++)
      {
          if(array[i].compareToIgnoreCase(array[j])>0)
          {
              temp = array[i];
              array[i]=array[j];
              array[j]=temp;
          }
      }
  }
}    
//bubble sort for both integers and strings
/**
* @param array
* @param f
* @return
*/
public static String[] bubbleSortString1(String array[],int f)
{
  for(int i=0;i<f;i++)
  {
      for( int j=1;j<f;j++)
      {
          if(array[j-1].compareToIgnoreCase(array[j])>0)
          {
              String temp=array[j-1];
              array[j-1]=array[j];
              array[j]=temp;
          }
      }
  }
return array;
}
//binary search
/**
* @param str
* @param key
* @return
*/
public static int binarySearch(String str[],String key)
{
  int first=0;
  int last=str.length-1;
  int middle=(first+last)/2;
  while(first<=last)
  {
      if(str[middle].compareToIgnoreCase(key)<0)
          first=middle+1;
      else if(str[middle].compareToIgnoreCase(key)==0)
      {
          return middle;
      }
      else 
          last=middle-1;
      middle=(first+last)/2;
  }
  return -1;
}

//anagram detection
/**
 * Static function to check if the two strings are anagram or not.
 * 
 * @param str1 the string to be checked for anagram
 * @param str2 the string to be checked for anagram
 * @return true if the strings are anagram else false
 */
public static boolean anagramDetection(String str1, String str2) {
    char[] ch1 = str1.toLowerCase().toCharArray();
    char[] ch2 = str2.toLowerCase().toCharArray();
    if (ch1.length != ch2.length) {
        return false;
    } else {
        ch1 = sortChar(ch1);
        ch2 = sortChar(ch2);
        str1 = String.valueOf(ch1);
        str2 = String.valueOf(ch2);
        boolean b = str1.equals(str2);
        {
            if (b == true)
                return true;
        }
    }
    return false;
}

/**
 * static method is used to sort array of characters
 * 
 * @param ch is the character array
 * @return sorted character array
 */
public static char[] sortChar(char[] ch) {
    char[] b = new char[ch.length];
    for (int i = 0; i < ch.length; i++) {
        int count = 0;
        for (int j = 0; j < ch.length; j++) {
            if (ch[i] < ch[j]) {
                count++;
            }
        }
        b[count] = ch[i];
    }
    return b;
}


}
