package com.bridgelabz.datastructureprograms;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.*;


public class UnOrderedUsingFileInput  {
    public static void main(String[] args) throws IOException 
    {
    	Scanner sc=new Scanner(System.in);
        String str="C:/Users/Mohammed Sibgath/Desktop/newFile.txt";
        FileReader f=new FileReader(str);
        BufferedReader read=new BufferedReader(f);
        FileWriter w=new FileWriter("C:/Users/Mohammed Sibgath/Desktop/newFile.txt",true);
        BufferedWriter writer = new BufferedWriter(w);
        final String DELIMITER=" ";
        Node nd=null;
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

