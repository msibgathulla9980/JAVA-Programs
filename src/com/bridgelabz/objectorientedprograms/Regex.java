package com.bridgelabz.objectorientedprograms;
/******************************************************************************
 *  Compilation:  javac -d bin InventoryJson.java
 *  Execution:    java -cp bin com.bridgelabz.objectorientedprograms.InventoryJson
 *  
 *  Purpose:  Read in the following message: Hello <<name>>, We have your full name as <<full name>> in our system. 
 *            your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification 
 *            Thank you BridgeLabz 01/01/2016. Use Regex to replace name, full name, Mobile#, and Date with proper value.

 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   16-01-2019
 *
 ******************************************************************************/
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.OopsUtility;

public class Regex {

    public static void main(String[] args) throws IOException {
        String str = "C:\\Users\\Mohammed Sibgath\\Desktop\\newFile.txt";
        String line=OopsUtility.readFile(str);
        System.out.println("Please enter the first name");
        String firstName = DataStructureUtility.userString();
        System.out.println("Please enter the last name");
        String lastName = DataStructureUtility.userString();
        String fullName = firstName + " " + lastName;
        System.out.println("Please enter your 10 digit phone number");
        String phoneNum = DataStructureUtility.userString();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");  
        LocalDateTime now = LocalDateTime.now();  
        String date=dtf.format(now);
        String message = OopsUtility.replaceString(firstName, fullName, phoneNum, date, line);
        System.out.println(message);
        
    }
}

