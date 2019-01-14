package com.bridgelabz.objectorientedprograms;
import com.bridgelabz.utility.*;
/*
* Created by: Mohammed Sibgathulla
* Date: 12/01/2019
* Purpose: Model class for storing stock details.
**/
public class StockUtility {
	
	
		private String stockName;
		private int stockPrice;
		private int stockNumber;
		

		public void Stock(String stockName,int stockPrice,int stockNumber)
		{
			this.stockName=stockName;
			this.stockPrice=stockPrice;
			this.stockNumber=stockNumber;
		}
		
		public void Stock(){
		}

		public String getStockName(){
			return stockName;
		}

		public int getStockPrice(){
			return stockPrice;
		}

		public int getStockNumber(){
			return stockNumber;
		}

		public void setStockName(String stockName){
			this.stockName=stockName;
		}

		public void setStockPrice(int stockPrice){
			this.stockPrice=stockPrice;
		}

		public void setStockNumber(int stockNumber){
			this.stockNumber=stockNumber;
		}

		public String toString(){
			return stockName+" "+stockPrice+" "+stockNumber+"  "+(stockPrice*stockNumber)+" "+"\n";
		}
	}

