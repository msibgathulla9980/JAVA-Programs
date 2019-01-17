package com.bridgelabz.objectorientedprograms;
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

