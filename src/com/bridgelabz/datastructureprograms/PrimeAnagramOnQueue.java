package com.bridgelabz.datastructureprograms;
/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagramOnQueue.java
 *  Execution:    java -cp bin com.bridgelabz.datastructure program.PrimeAnagramOnQueue n
 *  
 *  Purpose:Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Queue using the Linked List
 *           and Print the Anagrams from the Queue.Note no Collection Library can be used.
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   17-12-2018
 *
 ******************************************************************************/
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.Queue1;

public class PrimeAnagramOnQueue {

	public static void main(String[] args) {
        Queue1 queue=new Queue1(1000);
        List<Integer> list2 = new ArrayList<Integer>();
        list2 = DataStructureUtility.findPrime(0,1000); //finding prime
        queue = DataStructureUtility.primeAnagram3(list2); //finding anagram
        System.out.println(queue.size()+" is the size of queue");
        System.out.println("Elements in a queue are :");
        while(!queue.isQueueEmpty())
        {
            queue.dequeue();
            queue.dequeue();
            System.out.println();
        }
    }
}
