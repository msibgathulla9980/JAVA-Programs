package com.bridgelabz.functionalprograms;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
public class AlgorithmUtility {
	/////////////////////////////////////////
	public void Anagram(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			System.out.println("Str1 and Str2 are not Anagrams");	
		}
		char[] char1=str1.toLowerCase().toCharArray();
		char[] char2=str2.toLowerCase().toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		if(char1==char2)
		{
			System.out.println("Str1 and Str2 are Anagrams");	
		}
		else
		{
			System.out.println("Str1 and Str2 are not Anagrams");	
		}


	}

	//////////////////////////////////
	public void Prime()
	{
		for(int i=1;i<=1000;i++){

			int flag=1;

			for(int j=2;j<i;j++){
				if(i%j==0)
				{
					flag=0;
					break;

				}
			}
			if (flag==1)
			{
				System.out.println(i);
			}
		}
		////////////////////////////
	}

}

