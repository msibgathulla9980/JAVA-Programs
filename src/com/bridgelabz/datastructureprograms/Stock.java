package com.bridgelabz.datastructureprograms;

/*
* created by: Mohammed Sibgathulla
* Date: 09/01/2019
* Purpose: Write a program to read in Stock Names, Number of Share, Share Price. Print a Stock Report with total value of each Stock and the total value of Stock.
**/
import com.bridgelabz.utility.*;

public class Stock
{
	public static void main(String args[])
	{
		UtilityRegex ur=new UtilityRegex();
		//get stock details read stock details from newFile.txt and display reports	
		System.out.println(UtilityRegex.getStockDetails("C:\\Users\\Mohammed Sibgath\\Desktop\\newFile1.txt"));
	}
}
