package com.bridgelabz.objectorientedprograms;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.Inventory;
import com.bridgelabz.utility.InventoryList;
import com.bridgelabz.utility.OopsUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgelabz.utility.Inventory;
import com.bridgelabz.utility.InventoryList;
import com.bridgelabz.utility.OopsUtility;

public class InventoryJson {
    public static void main(String[] args) throws IOException {

        String file = "F:\\Mohammed Sibgath1\\Bridgelabz\\JavaPrograms\\JAVA-Programs\\src\\com\\bridgelabz\\objectorientedprograms\\Inventory.json";
        ObjectMapper objectMapper = new ObjectMapper();//(present in external jar file)used to convert the string to the object and vice versa
        List<InventoryList> list2 = new ArrayList<InventoryList>();
        InventoryList inventoryList = new InventoryList();//contains the rice.....
        List<Inventory> liInventories = new ArrayList<Inventory>();
        String str = OopsUtility.readFile(file);//
        int z = 0;
        do {
            System.out.println("1.Display file\n2.Add to file\n3.Check for price\n4.exit");
            Scanner sc=new Scanner(System.in);
           
            int choice = DataStructureUtility.userInteger();
            switch (choice) {
          case 1://display
                try {//read value is the method that is defined in the class object mapper.()
                    list2 = objectMapper.readValue(str, new TypeReference<List<InventoryList>>() //belongs to jackson file of the object and vice versa
               
                    		{//converting the str to the jason objects(in terms of list)
                    }); 
                    
                    OopsUtility.display(list2);
                } catch (Exception e) {
                    System.out.println("file is empty!! first add inputs on to file or select second choice");
                }
                break;
            case 2:
                list2 = objectMapper.readValue(str, new TypeReference<List<InventoryList>>() {});
//                String [] arr= {"","rice","wheat","pulses"};
                System.out.println("Enter the inventory name i.e rice, wheat,pulses(in small letters)");
                String inventoryName = DataStructureUtility.userString();
                int op = 1, flag = 0;
                while (op == 1) {
                    for (InventoryList invenList : list2)//loop for rice, wheat and pulse 
                    {
                        if (inventoryName.equals(invenList.getInventoryName())) {
                            liInventories = invenList.getListOfInventories();
                            Inventory inventory = OopsUtility.insertInventoryDetail();
                            liInventories.add(inventory);
                            flag = 1;//If the list to be added is available do not proceed
                        }
                    }
                    if (flag == 0) //If the list to be added is not available, then adds it
                    {
                        Inventory inventory = OopsUtility.insertInventoryDetail();
                        liInventories.add(inventory);
                        inventoryList = OopsUtility.insertInventoryList(inventoryName, liInventories);
                        list2.add(inventoryList);
                    }
                    System.out.println("wish to add some more inventorry(1 or 0)");
                    op = DataStructureUtility.userInteger();
                }
                
                System.out.println("Entered elements has been added to list");
                String json = objectMapper.writeValueAsString(list2);
                OopsUtility.write(json);
                System.out.println("Inventory list has been written on to file");
                break;
            case 3:
                list2 = objectMapper.readValue(str, new TypeReference<List<InventoryList>>() {
                });
                OopsUtility.price(list2);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("please select correct choice");
                break;

            }
            z++;
        } while (z < 30);
    }
}