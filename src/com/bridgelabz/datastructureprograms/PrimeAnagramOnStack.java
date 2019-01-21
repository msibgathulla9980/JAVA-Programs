package com.bridgelabz.datastructureprograms;
/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagramOnStack.java
 *  Execution:    java -cp bin com.bridgelabz.datastructure program.PrimeAnagramOnStack n
 *  
 *  Purpose:Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using the Linked List
 *           and Print the Anagrams from the Stack.Note no Collection Library can be used.
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.Stack1;

public class PrimeAnagramOnStack {
	
	public static void main(String[] args) {
		
			
	    Stack1 stack=new Stack1();
	    List<Integer> list2 = new ArrayList<Integer>();
	    list2 = DataStructureUtility.findPrime(0,1000); //finding prime
	    stack=DataStructureUtility.primeAnagram21(list2); //finding anagram
	    System.out.println(stack.size()+" is the size of the stack");
	    System.out.println("Printing the elements in reverse order using pop function of stack");
	    while(!stack.isEmpty())
	    {
	        System.out.println(stack.pop()+" "+stack.pop());
	    }
		
		}
	
}
