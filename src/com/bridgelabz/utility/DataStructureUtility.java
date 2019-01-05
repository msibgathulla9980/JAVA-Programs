package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataStructureUtility {
	
	public static boolean simpleBalancedParenthesis(String exp) {
		
	      int len=exp.length();
	        Stack Stack1=new Stack(len);
	          int i=0;
	             while(i<len)
	             {
	                 if(exp.charAt(i)==')'&&Stack1.isEmpty())
	                  return false;
	                 else if(exp.charAt(i)==')')
	                  Stack1.pop();
	                 else if(exp.charAt(i)=='(')
	                  Stack1.push(i);
	                 ++i;
	             }
	         if (Stack1.isEmpty())
	             return true;
	         else
	             return false; 
	         }

	// A function to find  
	// factorial of a given number 
	public static int factorial(int n) 
	{ 
	    int res = 1; 
	  
	    // Calculate value of  
	    // [1*(2)*---*(n-k+1)] /  
	    // [k*(k-1)*---*1] 
	    for (int i = 1; i <= n; ++i) 
	    { 
	        res *= i; 
	    } 
	  
	    return res; 
	} 
	  
	public static int binomialCoeff(int n, int k) 
	{ 
	    int res = 1; 
	  
	    // Since C(n, k) = C(n, n-k) 
	    if (k > n - k) 
	        k = n - k; 
	  
	    // Calculate value of  
	    // [n*(n-1)*---*(n-k+1)] /  
	    // [k*(k-1)*---*1] 
	    for (int i = 0; i < k; ++i) 
	    { 
	        res *= (n - i); 
	        res /= (i + 1); 
	    } 
	  
	    return res; 
	} 
	  
	  
	// A Binomial coefficient  
	// based function to find  
	// nth catalan number in  
	// O(n) time 
	public static int catalan( int n) 
	{ 
	      
	    // Calculate value of 2nCn 
	    int c = binomialCoeff(2 * n, n); 
	  
	    // return 2nCn/(n+1) 
	    return c / (n + 1); 
	} 
	  
	// A function to count number of 
	// BST with n nodes using catalan 
	public static int countBST( int n) 
	{ 
	    // find nth catalan number 
	    int count = catalan(n); 
	  
	    // return nth catalan number 
	    return count; 
	} 
	  
	public static List<Integer> primeNumbers(int m,int n) {
        List<Integer> lst=new ArrayList<Integer>();
        int temp;

        //swapping of bounds if the given lower bound is greater than upper bound
        if(m>n) {
            temp=m;
            m=n;
            n=temp;}
        int flag=1;
        //try all the possible values from lower bound to upper bound
        //if the number has the factor then it must be checked within lower bound
        for(int i=m;i<=n;i++){
            for(int j=2;j<i;j++){
                //If the number is divisible by any of the number then 
                //initializing flag to zero and break
                //else flag is initialized to one
                if(i%j==0){
                    flag=0;
                    break;}
                else
                    flag=1;}
            //If the number is prime which is indicated by the flag,
            //then adds the number into an ArrayList.
            if(flag==1)
                lst.add(i);}
        return lst;
        }
	//////////
	public static List<Integer> findPrime(int low,int high) {
        int flag = 1;
        int i;
        List<Integer> arr = new ArrayList<>();
        for (i = low; i < high; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else
                    flag = 1;
            }
            if (flag == 1) {
                arr.add(i);
            }
        }
        return arr;
    }
	//////////////
    public static Set<Integer> primeAnagram(List<Integer> primeList) {
        Set<Integer> primeAnagram = new HashSet<>();
        for (int i = 0; i < primeList.size(); i++) {
            for (int j = i+1; j < primeList.size(); j++) {
                if (AlgorithmUtility.anagramDetection(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
                    primeAnagram.add(primeList.get(i));
                    primeAnagram.add(primeList.get(j));
                }
            }
        }
        return primeAnagram;
    }
	//////////////
	public static void printPrimeAndAnagram(List<List<Integer>> list1)
    {
        List<Integer> demo = new ArrayList<Integer>();
        for (int i = 0; i < list1.size(); i++) {
            demo = list1.get(i);
            if (i == 0) {
                System.out.println("Numbers which are prime and anagram are:"+demo.size());
                System.out.println();
                for (int j = 0; j < demo.size(); j++) {
                    System.out.print(demo.get(j) + " ");
                }
            } else {
                System.out.println("Numbers which are prime but not anagram are:"+demo.size());
                System.out.println();
                for (int j = 0; j < demo.size(); j++) {
                    System.out.print(demo.get(j) + " ");
                }
            }
            System.out.println();
        }
    }
	/////////////////////////// Calendar Function
	static int[][] calendar = new int[5][7];
	static int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static void initCal() {
		for (int i = 0; i < calendar.length; i++) {
			for (int j = 0; j < calendar[i].length; j++) {
				calendar[i][j] = -10;
			}
		}
	}

	public static void display(int m) {
		System.out.println("	Sun	Mon	Tue	Wed	Thu	Fri	Sat");

		for (int i = 0; i < calendar.length; i++) {
			for (int j = 0; j < calendar[i].length; j++) {
				if (calendar[i][j] < 0 || calendar[i][j] > month[m - 1]) {
					System.out.print("\t ");
				}
				else if (calendar[i][j] > 0) {
					
					System.out.print("\t" + calendar[i][j] + " ");
				}
			}
			System.out.println("\t");
		}
	}

	public static void putCalendar(int d) {
		int d1 = 1;
		for (int i = d; i < calendar[0].length; i++) {
			// System.out.print(d1);
			calendar[0][i] = d1++;
		}
		for (int i = 1; i < calendar.length; i++) {
			for (int j = 0; j < calendar[i].length; j++) {
				calendar[i][j] = d1++;
			}
		}

	}

	public static void dispCalendar(int m, int y) {
		int d = dayOfWeek(m, y);
		initCal();
		putCalendar(d);
		display(m);

	}

	public static int dayOfWeek(int m, int y) {
		int d = 1;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
}
