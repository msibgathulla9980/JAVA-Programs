package com.bridgelabz.datastructureprograms;
/******************************************************************************
 *  Compilation:  javac -d bin TestOrderedListForIntegers.java
 *  Execution:    java -cp bin com.bridgelabz.datastructure program.TestOrderedListForIntegers n
 *  
 *  Purpose: Read a List of Numbers from a file and arrange it ascending Order in a Linked List. 
 *          Take user input for a number, if found then pop the number out of the list else insert 
 *           the number in appropriate position

 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;



public class TestOrderedListForIntegers  {
    public static void main(String[] args) throws IOException 
    {
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        String str="C:/Users/Mohammed Sibgath/Desktop/newFile.txt";
        FileReader f=new FileReader(str);
        @SuppressWarnings("resource")
		BufferedReader read=new BufferedReader(f);
        FileWriter w=new FileWriter("C:/Users/Mohammed Sibgath/Desktop/newFile1.txt",true);
        BufferedWriter writer = new BufferedWriter(w);
        final String DELIMITER=" ";
        int n=0;
        LinkedList<Integer> li=new LinkedList<>();
        LinkedList<Integer> li2=new LinkedList<>();
        try 
        {
            String word; 
              while ((word = read.readLine()) != null) 
              {
              String[] tokens = word.split(DELIMITER);
                for(String token:tokens)
                {
                    li.add(Integer.parseInt(token));
                }
              }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
              
              System.out.println("List of integers in a file are :");
              int length=li.print();
              int [] arr=li.convInteger(li,length);
                int [] arr2=li.sortArray(arr);
                System.out.println("after sorting:");
                for(int i:arr2)
                {
                    li2.add(i);
                }
                li2.print();
              do {
                  System.out.println("1.Enter the integer value to be to be searched\n2.Exit the program and display the file ");
                  int choice=sc.nextInt();
                  switch(choice)
                  {
                  case 1: System.out.println("enter the integer to be searched from sorted list:");
                            int key=sc.nextInt();
                            int len=li2.size();
                            System.out.println(len);
                            boolean b=li2.findIntegerValue(len,key,li2);
                            if(b)
                            {
                                System.out.println("name found");
                                System.out.println("number is removed from the file ");
                                System.out.println("new file list is :");
                                li2.printNew();
                            }
                            else
                            {
                                System.out.println("Integer not found");
                                System.out.println("seached word added to file ");
                                li2.printNew();
                            }
                            break;
                            
                  case 2:  
                              FileOutputStream writer2 = new FileOutputStream("C:/Users/Mohammed Sibgath/Desktop/newFile.txt");
                            writer2.write(("").getBytes());
                            writer2.close();
                              int len2=li2.size();
                              li2.printNew();
                              int [] newStr=li.convertInt(li2, len2);
                              String[] newStringArray = new String[newStr.length];
                              for(int i=0; i<newStr.length; i++) {
                                  newStringArray[i] = String.valueOf(newStr[i]);
                              }
                              for(int i=0;i<newStringArray.length;i++)
                              {
                                  writer.write(newStringArray[i]);
                                  writer.write(" ");
                              }
                              writer.flush();
                              writer.close();
                              System.exit(0);
                              break;
                  default :System.out.println("please select correct choice");
                              break;
                  }
                  
              n++;
              }while(n<30);
        

    }


}