package com.bridgelabz.datastructureprograms;

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
