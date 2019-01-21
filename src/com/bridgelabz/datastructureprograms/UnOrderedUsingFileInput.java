package com.bridgelabz.datastructureprograms;
/******************************************************************************
 *  Compilation:  javac -d binUnOrderedUsingFileInput.java
 *  Execution:    java -cp bin com.bridgelabz.datastructure program.UnOrderedUsingFileInputn
 *  
 *  Purpose:  Read the Text from a file, split it into words and arrange it as Linked List.
 *            Take a user input to search a Word in the List. If the Word is not found then 
 *            add it to the list, and if it found then remove the word from the List. In the
 *            end save the list into a file

 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class UnOrderedUsingFileInput  {
    public static void main(String[] args) throws IOException 
    {
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        String str="C:/Users/Mohammed Sibgath/Desktop/newFile.txt";
        FileReader f=new FileReader(str);
        @SuppressWarnings("resource")
		BufferedReader read=new BufferedReader(f);
        FileWriter w=new FileWriter(str,true);
        BufferedWriter writer = new BufferedWriter(w);
        final String DELIMITER=" ";
        int n=0;
        LinkedList<String> li=new LinkedList<>();
        try 
        {
            String word; 
              while ((word = read.readLine()) != null) 
              {
              String[] tokens = word.split(DELIMITER);
                for(String token:tokens)
                {
                    li.add(token);
                }
              }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
              System.out.println("words in a file are :");
              int length=li.print();
              do {
                  System.out.println("1.Enter the name to be searched\n2.Exit the program and display the file ");
                  int choice=sc.nextInt();
                  switch(choice)
                  {
                  case 1: System.out.println("enter the word to be searched");
                            String key=sc.next();
                            boolean b=li.printValue(length,key,li);
                            if(b)
                            {
                                System.out.println("name found");
                                System.out.println("word is removed from the file ");
                                System.out.println("new file list is :");
                                li.print();
                            }
                            else
                            {
                                System.out.println("name not found");
                                System.out.println("seached word added to file ");
                            }
                            break;
                            
                  case 2:  
                              FileOutputStream writer2 = new FileOutputStream("C:/Users/Mohammed Sibgath/Desktop/newFile.txt");
                            writer2.write(("").getBytes());
                            writer2.close();
                              int len=li.print();
                              String [] newStr=li.convString(li, len);
                              for(int i=0;i<newStr.length;i++)
                              {
                                  writer.write(newStr[i]);
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

