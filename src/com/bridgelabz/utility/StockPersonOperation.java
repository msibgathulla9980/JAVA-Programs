package com.bridgelabz.utility;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class StockPersonOperation {
    StockPortfolio stockPortfolio = null;
    StockPersonOperation stockPersonOperation = null;
    StockPerPerson stockPerPerson = null;
static LinkedList<String> linkedList=new LinkedList<String>();
static StackLinkedList<String> stackLinkedList=new StackLinkedList<String>();
static QueueLinkedList<String> queueLinkedList= new QueueLinkedList<String>();
static StackLinkedList<String> stackLinkedList2=new StackLinkedList<String>();
    public StockPerPerson buyStock() throws JsonGenerationException, JsonMappingException, IOException {
        stockPersonOperation = new StockPersonOperation();
        stockPortfolio = new StockPortfolio();
        StockPortfolio.displayStock();
        System.out.println("Select the stock name which has to be bought");
        String name = OopsUtility.userString();
        int flag = 0;
        for (Stock stock : StockPortfolio.liOfStock) {
            if (name.equals(stock.getStockName())) {
                System.out.println("Stock found");
                System.out.println("Adding into your account");
                stockPerPerson = new StockPerPerson();
                stockPerPerson.setStockName(stock.getStockName());
                boolean yes = true;
                while (yes == true) {
                    System.out.println("Select the number of shares");
                    int share = OopsUtility.userInt();
                    System.out.println("The Entered Shares are: "+share);
                    System.out.println("The Shares that are present are:"+stock.getNumberOfShare());
                    double s=stock.getNumberOfShare()-share;
                    System.out.println("The Shares remaining are: "+s );
                    if (stock.getNumberOfShare() >= share) {
                        stockPerPerson.setNumberofStocks(share);
                        stock.setNumberOfShare(stock.getNumberOfShare() - share);
                        yes = false;
                        String json = OopsUtility.userWriteValueAsString(StockPortfolio.liOfStock);
                        OopsUtility.writeFile(json, StockPortfolio.str);
                        break;
                    } else {
                        System.out.println("That amount of shares doesnot exist!!!");
                        yes = true;
                    }
                }
                System.out.println("The number of stocks are set");
                stockPerPerson.setStockPrice(stock.getSharePrice());
                Transactions transactions = new Transactions();
                transactions.setDate(OopsUtility.getDate());
                transactions.setTransactionStatus("Purchased");
                stockPerPerson.setTransactions(transactions);
                flag = 1;
                return stockPerPerson;
            }
        }
        if (flag == 0) {
            System.out.println("Stock name not found");
        }
        return null;
    }

    public void sellStock() throws JsonGenerationException, JsonMappingException, IOException {
        displayPerPersonStock();
        System.out.println("Enter the name to the stack to be sold");
        String sellStockName = OopsUtility.userString();
        int flag = 0;
        if (!StockPersonManagement.liOfStockPerPerson.isEmpty()) {
            for (StockPerPerson stockPerPerson : StockPersonManagement.liOfStockPerPerson) {
                if (sellStockName.equals(stockPerPerson.getStockName())) {
                    for (Stock stock : StockPortfolio.liOfStock) {
                        if (stock.getStockName().equals(stockPerPerson.getStockName())) {
                            stock.setNumberOfShare(stock.getNumberOfShare() + stockPerPerson.getNumberofStocks());
                        }
                        String json = OopsUtility.userWriteValueAsString(StockPortfolio.liOfStock);
                        OopsUtility.writeFile(json, StockPortfolio.str);
                    }
                    StockPersonManagement.liOfStockPerPerson.remove(stockPerPerson);
                    System.out.println("Stock has been removed from account ");
                    flag = 1;
                    break;
                }
               
            }
        } else {
            System.out.println("There are no stocks in account...!");
        }
        if (flag == 0) {
            System.out.println("Entered stock doesnot exist in account!!!");
        }
    }

    public void displayPerPersonStock() throws IOException {
        String string = OopsUtility.readFile(StockPersonManagement.getAccountName());
        try {
            StockPersonManagement.liOfStockPerPerson = OopsUtility.userReadValue(string, StockPerPerson.class);
        } catch (Exception e) {
            System.out.println("File is empty!!! Nothing in data to display");
          
        }
        for (StockPerPerson stockPerPerson : StockPersonManagement.liOfStockPerPerson) {
            System.out.println("Stock            : " + stockPerPerson.getStockName());
            System.out.println("Number of shares   : " + stockPerPerson.getNumberofStocks());
            System.out.println("Stock price        : " + stockPerPerson.getStockPrice());
            System.out.println("Date             :" + stockPerPerson.getTransactions().getDate());
            System.out.println("Transaction status :" + stockPerPerson.getTransactions().getTransactionStatus());
            System.out.println("----------------------------------------------------");
          
        }
    }
    //storing the Transaction Status in stack, StockName in Linked List and the Date Of Transaction in Queue.
    public void storeDynamic() throws IOException {
        String string = OopsUtility.readFile(StockPersonManagement.getAccountName());
        try {
            StockPersonManagement.liOfStockPerPerson = OopsUtility.userReadValue(string, Stock.class);
        } catch (Exception e) {
            System.out.println("File is empty!!! Nothing in data to display");
        }
        for (StockPerPerson stockPerPerson : StockPersonManagement.liOfStockPerPerson) {
        	
        	linkedList.add(stockPerPerson.getStockName());
        	queueLinkedList.enqueue(stockPerPerson.getTransactions().getDate());
            stackLinkedList.push(stockPerPerson.getTransactions().getTransactionStatus());
        }

    }
//Displaying the Transaction Status in stack, StockName in Linked List and the Date Of Transaction in Queue.
    public void displayDynamic() throws IOException {
        storeDynamic();
        System.out.println("Stock Name Bought with Date and Time and Transaction report is below :");
        System.out.print("Stock Name : ");
        linkedList.getLikedList();
        System.out.println();
        System.out.print("Date       : ");
        for (int i = 0; i < queueLinkedList.getSize(); i++) {
            System.out.print(queueLinkedList.dequeue() + "\t");
        }
        System.out.println();
        while (!stackLinkedList.isEmpty()) {
            stackLinkedList2.push(stackLinkedList.pop());
        }
        System.out.print("Status     : ");
        while (!stackLinkedList2.isEmpty()) {
            System.out.print(stackLinkedList2.pop() + "\t\t\t");
        }
        System.out.println(
                "\n---------------------------------------------------------------------------------------------------------");
    }
    }


