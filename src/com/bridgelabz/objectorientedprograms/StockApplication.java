package com.bridgelabz.objectorientedprograms;
/******************************************************************************
 *  Compilation:  javac -d bin StockApplication.java
 *  Execution:    java -cp bin com.bridgelabz.objectorientedprograms.StockApplication
 *  
 *  Purpose: Write a program to read in Stock Names, Number of Share, Share Price.  
 *           Print a Stock Report with total value of each Stock and the total value of Stock.


 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   -01-2019
 *
 ******************************************************************************/

import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import com.bridgelabz.utility.OopsUtility;
import com.bridgelabz.utility.StockPortfolio;

public class StockApplication {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		boolean run=true;
		while(run==true)
		{
			System.out.println("*****************STOCK APPLICATION******************");
			System.out.println("1.Add Stock\n2.Display\n3.Value of each Stock\n4.Total Stock value\n5.Exit");
			System.out.println("****************************************************");
			int choice=OopsUtility.userInt();
			switch(choice)
			{
			case 1:
				StockPortfolio.addStock();
				run=true;
				break;
			case 2:
				StockPortfolio.displayStock();
				run=true;
				break;
			case 3:
				StockPortfolio.valueOfEachStock();
				run=true;
				break;
			case 4:
				StockPortfolio.totalStockValue();
				run=true;
				break;
			case 5:
				System.exit(0);
				run=false;
				break;
			default:
				System.out.println("Please select correct choice");
				run=true;
				break;
			}
		}
	}
}



