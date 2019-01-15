package com.bridgelabz.utility;
import com.bridgelabz.utility.Transactions;;

public class StockPerPerson {
private String stockName;
private int numberofStocks;
private double StockPrice;
Transactions transactions=new Transactions();
public String getStockName() {
	return stockName;
}
public void setStockName(String stockName) {
	this.stockName = stockName;
}
public int getNumberofStocks() {
	return numberofStocks;
}
public void setNumberofStocks(int numberofStocks) {
	this.numberofStocks = numberofStocks;
}
public double getStockPrice() {
	return StockPrice;
}
public void setStockPrice(double stockPrice) {
	StockPrice = stockPrice;
}
public Transactions getTransactions() {
	return transactions;
}
public void setTransactions(Transactions transactions) {
	this.transactions = transactions;
}
}
