package com.bridgelabz.objectorientedprograms;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.Inventory;
import com.bridgelabz.utility.InventoryList;
import com.bridgelabz.utility.OopsUtility;



public class Json {
    public static void main(String[] args) throws IOException {
//        Inventory it=new Inventory();
        String str="F:\\Mohammed Sibgath1\\Bridgelabz\\JavaPrograms\\JAVA-Programs\\src\\com\\bridgelabz\\objectorientedprograms\\Inventory.json";
        String file=OopsUtility.readFile(str);
        System.out.println(file);
        ObjectMapper objectMapper = new ObjectMapper();
        List<InventoryList> list1 = new ArrayList<InventoryList>();
        InventoryList inventoryList = new InventoryList();
        inventoryList.setInventoryName("Rice");
        Inventory inventory = new Inventory();
        inventory.setName("Basmati");
        inventory.setWeight(40);
        inventory.setPrice(12);
        List<Inventory> liInventories = new ArrayList<Inventory>();
        liInventories.add(inventory);
        inventoryList.setListOfInventories(liInventories);
        list1.add(inventoryList);
        
        
        
        
        
        String json = objectMapper.writeValueAsString(list1);
        
        FileWriter fw = new FileWriter("F:\\Mohammed Sibgath1\\Bridgelabz\\JavaPrograms\\JAVA-Programs\\src\\com\\bridgelabz\\objectorientedprograms\\Inventory.json");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(json);
        bw.flush();
    

        
        
        List<InventoryList> list2 = objectMapper.readValue(file, new TypeReference<List<InventoryList>>() {});
        
            for(int i=0;i<list2.size();i++)
            {
                InventoryList it = list2.get(i);
                System.out.println("Name :"+it.getInventoryName());
                System.out.println("Type :"+it.getListOfInventories().get(0).getName());
                System.out.println("Weight In Stock :"+it.getListOfInventories().get(0).getWeight());
                System.out.println("Price/Kg :"+it.getListOfInventories().get(0).getPrice());
            }
        }
        
}
//        Inventory demo=objectMapper.readValue(file, Inventory.class);
//        System.out.println("name :"+demo.getName());
//        System.out.println("weight :"+demo.getWheat().get(0));
//        System.out.println("price :"+demo.getPulses().get(0)+"\n");





