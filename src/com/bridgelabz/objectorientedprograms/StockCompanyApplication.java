package com.bridgelabz.objectorientedprograms;
/******************************************************************************
 *  Compilation:  javac -d bin StockCompanyApplication.java
 *  Execution:    java -cp bin com.bridgelabz.objectorientedprograms.StockCompanyApplication
 *  
 *  Purpose: Write a program to read in Stock Names, Number of Share, Share Price.  
 *           Print a Stock Report with total value of each Stock and the total value of Stock.
 *           and Create InventoryManager to manage the Inventory. The Inventory Manager will 
 *           use InventoryFactory to create Inventory Object from JSON. The InventoryManager
 *            will call each Inventory Object in its list to calculate the Inventory Price and 
 *            then call the Inventory Object to return the JSON String. The main program will be
 *             with InventoryManager



 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   19-01-2019
 *
 ******************************************************************************/
import java.io.IOException;

import com.bridgelabz.utility.OopsUtility;
import com.bridgelabz.utility.StockPersonManagement;

public class StockCompanyApplication {
    public static void main(String[] args) throws IOException {
        StockPersonManagement stockPersonManagement=new StockPersonManagement();
        boolean run = true;
        while (run == true)
        {
            System.out.println("****************STOCK APP********************");
        System.out.println("1.Do you want to Create an Account, If yes press 1\n2.Do you want to Open the Existing Account\n3.Exit");
        int choice = OopsUtility.userInt();
        switch (choice) {
        case 1:stockPersonManagement.createPersonalAccount();
            run = true;
            break;
        case 2:stockPersonManagement.openPersonnelAccount();
            run = true;
            break;
        case 3:
            System.out.println(" Do Visit Again!!!");
            run = false;
            System.exit(0);
            break;
        default:
            System.out.println("Select The appropriate choice");
            run = true;
            break;
        }
        }
    }
}

