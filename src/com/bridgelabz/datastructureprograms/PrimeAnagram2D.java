package com.bridgelabz.datastructureprograms;
/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagram2D.java
 *  Execution:    java -cp bin com.bridgelabz.datastructure program.PrimeAnagram2D n
 *  
 *  Purpose:Extend the Prime Number Program and store only the numbers in that range that are Anagrams. 
 *          For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range. 
 *          Further store in a 2D Array the numbers that are Anagram and numbers that are not Anagram
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   15-12-2018
 *
 ******************************************************************************/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.bridgelabz.utility.*;

public class PrimeAnagram2D {
    public static void main(String[] args) {
        List<List<Integer>> list1 = new ArrayList<List<Integer>>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        list3 = DataStructureUtility.findPrime(0,1000);
        System.out.println("Total number of prime numbers are :"+list3.size());
        set = DataStructureUtility.primeAnagram(list3);
        list2.addAll(set);
        list1.add(list2);
        for (int i = 0; i < list2.size(); i++) {
            if (list3.contains(list2.get(i))) {
                list3.remove(list2.get(i));
            }
        }
        list1.add(list3);
        DataStructureUtility.printPrimeAndAnagram(list1);        
    }
}